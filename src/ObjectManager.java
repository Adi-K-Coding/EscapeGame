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
		platforms.add(new Platform(0, 500, 800, 20));
		platforms.add(new Platform(400, 300, 200, 20));
	}

	void draw(Graphics g) {
		player.draw(g);
		for (int i = 0; i < platforms.size(); i++) {
			platforms.get(i).draw(g);
			g.setColor(Color.ORANGE);
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
		for (int k = 0; k < platforms.size(); k++) {
			if (player.collisionBox.intersects(platforms.get(k).collisionBox)) {
				System.out.println("it works");
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
