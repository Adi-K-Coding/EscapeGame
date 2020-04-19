import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectManager implements ActionListener {

	static ArrayList<Platform> platforms = new ArrayList<Platform>();
	public static Player player;

	ObjectManager(Player player) {
		addPlatform();
		ObjectManager.player = player;
	}

	void addPlatform() {
		// Code For New Platform: platforms.add(new Platform(x, y, width, height));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(500, 350, 200, 20));
		platforms.add(new Platform(750, 500, 200, 600));
		platforms.add(new Platform(1100, 500, 200, 600));
		platforms.add(new Platform(1450, 500, 200, 600));
		platforms.add(new Platform(1600, 400, 100, 20));
		platforms.add(new Platform(1750, 300, 100, 20));
		platforms.add(new Platform(1900, 200, 100, 20));
		platforms.add(new Platform(2000, 500, 100, 600));
		platforms.add(new Platform(2110, 400, 100, 700));
		platforms.add(new Platform(2220, 300, 100, 800));
		platforms.add(new Platform(2330, 200, 100, 900));
	}

	void draw(Graphics g) {
		player.draw(g);
		for (int i = 0; i < platforms.size(); i++) {
			platforms.get(i).draw(g);
			g.setColor(Color.BLUE);
			g.drawRect(platforms.get(i).collisionBox.x, platforms.get(i).collisionBox.y,
					platforms.get(i).collisionBox.width, platforms.get(i).collisionBox.height);
		}
		g.setColor(Color.BLACK);
		g.drawRect(player.collisionBox.x, player.collisionBox.y, player.collisionBox.width, player.collisionBox.height);
	}

	void checkCollisions() {
		for (int k = 0; k < platforms.size(); k++) {
			if (player.collisionBox.intersects(platforms.get(k).collisionBox)) {
				System.out.println("it works");
				platforms.get(k).collisionState = 1;

			} else {
				platforms.get(k).collisionState = 0;
			}
		}
	}

	public static boolean isGoingToCollide(int dx, int dy) {
		Rectangle playerPredictPostition = new Rectangle(player.collisionBox.x + dx, player.collisionBox.y + dy,
				player.collisionBox.width, player.collisionBox.height);
		for (int k = 0; k < platforms.size(); k++) {
			if (playerPredictPostition.intersects(platforms.get(k).collisionBox)) {
				System.out.println("Player and Platform Collided");
				player.velocity = 0;
				return true;
			}
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	void update() {
		player.update();
		for (int j = 0; j < platforms.size(); j++) {
			platforms.get(j).update();
		}
		checkCollisions();
	}
}
