import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectManager implements ActionListener {

	static ArrayList<Platform> platforms = new ArrayList<Platform>();
	static ArrayList<Spike> spikes = new ArrayList<Spike>();
	public static Player player;
	public static EndObject endObject;
	int levelNumber = 1;
	int previousLevelNumber = 1;

	ObjectManager(Player player) {
		ObjectManager.player = player;
		createLevel(1);

	}

	void createLevel(int level) {
		if (level == 0) {
			transitionLevel();
		} else if (level == 1) {
			levelOnePlatforms();
		} else if (level == 2) {
			levelTwoPlatforms();
		} else if (level == 3) {
			levelThreePlatforms();
		} else if (level == 4) {
			levelFourPlatforms();
		} else if (level == 5) {
			levelFivePlatforms();
		} else if (level == 6) {
			levelSixPlatforms();
		}

	}

	void transitionLevel() {
		platforms.clear();
		player.x = 0;
		player.y = 0;
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(100, 0, 10, 1000));
		platforms.add(new Platform(600, 0, 10, 1000));
	}

	void levelOnePlatforms() {
		platforms.clear();
		previousLevelNumber = 1;
		player.x = 0;
		player.y = 0;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
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
		previousLevelNumber = 2;
		player.x = 0;
		player.y = 0;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 500, 200, 600));
		platforms.add(new Platform(1050, 600, 50, 500));
		platforms.add(new Platform(1200, 500, 200, 600));
		platforms.add(new Platform(1550, 600, 50, 500));
		platforms.add(new Platform(1700, 500, 550, 500));
		platforms.add(new Platform(1800, -200, 50, 470));
		platforms.add(new Platform(2200, -200, 50, 700));
		platforms.add(new Platform(2100, 400, 100, 20));
		platforms.add(new Platform(1850, 250, 100, 20));
		platforms.add(new Platform(2100, 100, 100, 20));
		platforms.add(new Platform(1850, -50, 100, 20));
		platforms.add(new Platform(2100, -200, 100, 20));
		platforms.add(new Platform(2300, -200, 200, 20));
		platforms.add(new Platform(2500, -100, 50, 20));
		platforms.add(new Platform(2700, 0, 50, 20));
		platforms.add(new Platform(2900, 100, 50, 20));
		platforms.add(new Platform(3100, 200, 50, 20));
		platforms.add(new Platform(2900, 400, 200, 20));
		platforms.add(new Platform(2700, 500, 100, 20));
		endObject = new EndObject(2725, 450, 50, 50);
	}

	void levelThreePlatforms() {
		platforms.clear();
		previousLevelNumber = 3;
		player.x = 0;
		player.y = 0;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 500, 100, 600));
		platforms.add(new Platform(900, 300, 100, 600));
		platforms.add(new Platform(1100, 100, 100, 600));
		// spiral

		// platforms.add(new Platform(, 300, 100, 600));

		endObject = new EndObject(2725, 450, 50, 50);
	}

	void levelFourPlatforms() {
		platforms.clear();
		previousLevelNumber = 4;
		player.x = 0;
		player.y = 0;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 350, 100, 750));
		platforms.add(new Platform(900, 200, 100, 900));
		platforms.add(new Platform(1100, 50, 100, 1050));
		platforms.add(new Platform(1300, -100, 100, 1200));
		platforms.add(new Platform(1500, -200, 100, 20));
		platforms.add(new Platform(1700, -100, 100, 20));
		platforms.add(new Platform(1900, -200, 100, 20));
		platforms.add(new Platform(2100, -100, 100, 20));
		platforms.add(new Platform(2300, -200, 100, 20));
		platforms.add(new Platform(2500, -100, 100, 20));
		platforms.add(new Platform(2700, 100, 100, 20));
		platforms.add(new Platform(2500, 300, 100, 20));
		platforms.add(new Platform(2700, 500, 100, 20));
		endObject = new EndObject(2725, 450, 50, 50);
	}

	void levelFivePlatforms() {
		platforms.clear();
		previousLevelNumber = 5;
		player.x = 0;
		player.y = 0;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 500, 500, 600));
		platforms.add(new Platform(1300, 500, 100, 600));// THRU 1-JUMP PLATFORM
		platforms.add(new Platform(1475, -400, 50, 550));// THRU 1- UP TUBE
		spikes.add(new Spike(1475, 150, 50, 50, true));
		spikes.add(new Spike(1475, 400, 50, 50, true));
		platforms.add(new Platform(1475, 450, 50, 600));// THRU 1- DOWN TUBE
		platforms.add(new Platform(1600, 500, 100, 600));// THRU 1- RECEIVE PLATFORM;THRU 2-JUMP PLATFORM
		platforms.add(new Platform(1775, -400, 50, 550));// THRU 2- UP TUBE
		spikes.add(new Spike(1775, 150, 50, 50, true));
		spikes.add(new Spike(1775, 400, 50, 50, true));
		platforms.add(new Platform(1775, 450, 50, 600));// THRU 2- DOWN TUBE
		platforms.add(new Platform(1900, 500, 100, 600));// THRU 2- RECEIVE PLATFORM;THRU 3-JUMP PLATFORM
		platforms.add(new Platform(2075, -400, 50, 550));// THRU 3- UP TUBE
		spikes.add(new Spike(2075, 150, 50, 50, true));
		spikes.add(new Spike(2075, 400, 50, 50, true));
		platforms.add(new Platform(2075, 450, 50, 600));// THRU 3- DOWN TUBE
		platforms.add(new Platform(2200, 500, 100, 600));// THRU 3- RECEIVE PLATFORM
		platforms.add(new Platform(2500, 400, 100, 600));
		platforms.add(new Platform(2800, 300, 100, 700));
		platforms.add(new Platform(3100, 200, 500, 800));
		platforms.add(new Platform(3500, 200, 100, 600));// THRU 1-JUMP PLATFORM
		platforms.add(new Platform(3675, -700, 50, 550));// THRU 1- UP TUBE
		spikes.add(new Spike(3675, -150, 50, 50, true));
		spikes.add(new Spike(3675, 100, 50, 50, true));
		platforms.add(new Platform(3675, 150, 50, 600));// THRU 1- DOWN TUBE
		platforms.add(new Platform(3800, 200, 100, 600));// THRU 1- RECEIVE PLATFORM;THRU 2-JUMP PLATFORM
		platforms.add(new Platform(3975, -700, 50, 550));// THRU 2- UP TUBE
		spikes.add(new Spike(3975, -150, 50, 50, true));
		spikes.add(new Spike(3975, 100, 50, 50, true));
		platforms.add(new Platform(3975, 150, 50, 600));// THRU 2- DOWN TUBE
		platforms.add(new Platform(4100, 200, 100, 600));// THRU 2- RECEIVE PLATFORM;THRU 3-JUMP PLATFORM
		platforms.add(new Platform(4275, -700, 50, 550));// THRU 3- UP TUBE
		spikes.add(new Spike(4275, -150, 50, 50, true));
		spikes.add(new Spike(4275, 100, 50, 50, true));
		platforms.add(new Platform(4275, 150, 50, 600));// THRU 3- DOWN TUBE
		platforms.add(new Platform(4400, 200, 100, 600));// THRU 3- RECEIVE PLATFORM;THRU 4-JUMP PLATFORM
		platforms.add(new Platform(4600, 100, 50, 15));// transition platform
		// end object platforms below
		spikes.add(new Spike(4800, 40, 100, 10, true));
		spikes.add(new Spike(4800, 220, 100, 10, true));
		platforms.add(new Platform(4800, 200, 100, 20));
		platforms.add(new Platform(4800, 50, 10, 150));
		platforms.add(new Platform(4800, 50, 100, 20));
		spikes.add(new Spike(4900, 40, 10, 30, true));
		spikes.add(new Spike(4900, 200, 10, 30, true));
		// upper platforms
		platforms.add(new Platform(4700, -50, 20, 10));
		platforms.add(new Platform(4900, -50, 20, 10));
		// middle platform
		platforms.add(new Platform(5100, 150, 100, 10));
		endObject = new EndObject(4810, 150, 50, 50);
	}

	void levelSixPlatforms() {
		platforms.clear();
		previousLevelNumber = 6;
		player.x = 0;
		player.y = 0;
		platforms.add(new Platform(100, 500, 500, 600));
		endObject = new EndObject(2810, 450, 50, 50);
	}

	void draw(Graphics g) {
		player.draw(g);
		for (int i = 0; i < platforms.size(); i++) {
			platforms.get(i).draw(g);
			// outline for platforms
			// g.setColor(Color.BLUE);
			// g.drawRect(platforms.get(i).collisionBox.x, platforms.get(i).collisionBox.y,
			// platforms.get(i).collisionBox.width, platforms.get(i).collisionBox.height);
		}
		for (int n = 0; n < spikes.size(); n++) {
			spikes.get(n).draw(g);
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
			// levelNumber++;
			levelNumber = 0;
			createLevel(levelNumber);
		}
		for (int o = 0; o < spikes.size(); o++) {

			if (player.collisionBox.intersects(spikes.get(o).collisionBox)) {
				player.isAlive = false;
			}
		}
	}

	public static boolean isGoingToCollide(int dx, int dy) {
		Rectangle playerPredictPostition = new Rectangle(player.collisionBox.x + dx, player.collisionBox.y + dy,
				player.collisionBox.width, player.collisionBox.height);
		for (int k = 0; k < platforms.size(); k++) {
			if (playerPredictPostition.intersects(platforms.get(k).collisionBox)) {
				// System.out.println("Player and Platform Collided");
				if (dx == 0) {
					player.velocity = 0;
				}
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
		for (int m = 0; m < spikes.size(); m++) {
			spikes.get(m).update();
		}
		checkCollisions();
		endObject.update();
	}
}
