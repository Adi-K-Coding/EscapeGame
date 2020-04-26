import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectManager implements ActionListener {

	static ArrayList<Platform> platforms = new ArrayList<Platform>();
	public static Player player;
	public static EndObject endObject;
	int levelNumber = 1;

	ObjectManager(Player player) {
		ObjectManager.player = player;
		addPlatform(1);

	}

	void addPlatform(int level) {
		if (level == 1) {
			levelOnePlatforms();
		} else if (level == 2) {
			levelTwoPlatforms();
		} else if (level == 3) {
			levelThreePlatforms();
		}

	}

	void levelOnePlatforms() {
		platforms.clear();
		player.x = 0;
		player.y = 0;
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(500, 350, 200, 20));
		platforms.add(new Platform(750, 500, 200, 600));
		platforms.add(new Platform(1100, 500, 200, 600));
		platforms.add(new Platform(1450, 500, 200, 600));
		platforms.add(new Platform(1600, 400, 100, 20));
		platforms.add(new Platform(1750, 300, 100, 20));
		platforms.add(new Platform(1900, 200, 100, 20));
		platforms.add(new Platform(2000, 500, 100, 600));
		platforms.add(new Platform(2100, 400, 100, 700));
		platforms.add(new Platform(2200, 300, 100, 800));
		platforms.add(new Platform(2300, 200, 100, 900));
		platforms.add(new Platform(2400, 300, 100, 800));
		platforms.add(new Platform(2500, 400, 100, 700));
		platforms.add(new Platform(2600, 500, 100, 600));
		platforms.add(new Platform(2800, 500, 1000, 600));
		endObject = new EndObject(3000, 400, 50, 50);
	}

	void levelTwoPlatforms() {
		platforms.clear();
		player.x = 0;
		player.y = 0;
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 500, 200, 600));
		platforms.add(new Platform(1200, 500, 200, 600));
	}

	void levelThreePlatforms() {
		platforms.clear();
		player.x = 0;
		player.y = 0;
	}

	void draw(Graphics g) {
		player.draw(g);
		for (int i = 0; i < platforms.size(); i++) {
			platforms.get(i).draw(g);
			// g.setColor(Color.BLUE);
			// g.drawRect(platforms.get(i).collisionBox.x, platforms.get(i).collisionBox.y,
			// platforms.get(i).collisionBox.width, platforms.get(i).collisionBox.height);
		}
		g.setColor(Color.BLACK);
		g.drawRect(player.collisionBox.x, player.collisionBox.y, player.collisionBox.width, player.collisionBox.height);
		endObject.draw(g);
		g.setColor(Color.BLACK);
		g.drawRect(endObject.collisionBox.x, endObject.collisionBox.y, endObject.collisionBox.width,
				endObject.collisionBox.height);
	}

	void checkCollisions() {
		for (int k = 0; k < platforms.size(); k++) {
			if (player.collisionBox.intersects(platforms.get(k).collisionBox)) {
				// System.out.println("it works");
				platforms.get(k).collisionState = 1;

			} else {
				platforms.get(k).collisionState = 0;
			}
		}
		if (endObject.collisionBox.intersects(player.collisionBox)) {
			levelNumber++;

			addPlatform(levelNumber);
		}
	}

	public static boolean isGoingToCollide(int dx, int dy) {
		Rectangle playerPredictPostition = new Rectangle(player.collisionBox.x + dx, player.collisionBox.y + dy,
				player.collisionBox.width, player.collisionBox.height);
		for (int k = 0; k < platforms.size(); k++) {
			if (playerPredictPostition.intersects(platforms.get(k).collisionBox)) {
				// System.out.println("Player and Platform Collided");
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
		endObject.update();
	}
}
