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
		player.left = false;
		player.right = false;
		player.up = false;
		player.down = false;
		platforms.clear();
		spikes.clear();
		player.x = 0;
		player.y = 0;
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
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(100, 0, 10, 1000));
		platforms.add(new Platform(600, 0, 10, 1000));
	}

	void levelOnePlatforms() {
		previousLevelNumber = 1;
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
		endObject = new EndObject(3000, 400, 50, 100);
	}

	void levelTwoPlatforms() {
		previousLevelNumber = 2;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 500, 200, 600));
		platforms.add(new Platform(1050, 600, 50, 500));
		platforms.add(new Platform(1200, 500, 200, 600));
		platforms.add(new Platform(1550, 600, 50, 500));
		platforms.add(new Platform(1700, 500, 560, 500));
		platforms.add(new Platform(1790, -200, 50, 470));
		spikes.add(new Spike(1840, -200, 10, 470, true));
		platforms.add(new Platform(2210, -200, 50, 700));
		spikes.add(new Spike(2200, -180, 10, 680, true));
		spikes.add(new Spike(2300, 200, 420, 10, true));
		spikes.add(new Spike(2800, 220, 10, 300, true));
		platforms.add(new Platform(2100, 400, 100, 20));
		platforms.add(new Platform(1850, 250, 100, 20));
		platforms.add(new Platform(2100, 100, 100, 20));
		platforms.add(new Platform(1850, -50, 100, 20));
		platforms.add(new Platform(2100, -200, 110, 20));
		platforms.add(new Platform(2300, -200, 200, 20));
		platforms.add(new Platform(2500, -100, 50, 20));
		platforms.add(new Platform(2700, 0, 50, 20));
		platforms.add(new Platform(2900, 100, 50, 20));
		platforms.add(new Platform(3100, 200, 50, 20));
		platforms.add(new Platform(2900, 400, 200, 20));
		platforms.add(new Platform(2700, 500, 100, 20));
		endObject = new EndObject(2725, 400, 50, 100);
	}

	void levelThreePlatforms() {
		previousLevelNumber = 3;
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
		endObject = new EndObject(2725, 400, 50, 100);
	}

	void levelFourPlatforms() {
		previousLevelNumber = 4;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(700, 500, 100, 20));
		platforms.add(new Platform(900, 300, 100, 20));
		platforms.add(new Platform(1100, 100, 100, 20));
		platforms.add(new Platform(1300, -100, 100, 20));
		platforms.add(new Platform(1500, -100, 1000, 20));
		platforms.add(new Platform(2480, -1100, 20, 1000));
		platforms.add(new Platform(1500, -1100, 1000, 20));
		platforms.add(new Platform(1500, -1100, 20, 700));
		platforms.add(new Platform(1500, -400, 700, 20));
		platforms.add(new Platform(2200, -850, 20, 470));
		platforms.add(new Platform(1700, -850, 500, 20));
		platforms.add(new Platform(2430, -290, 50, 10));// jumps
		platforms.add(new Platform(2220, -480, 50, 10));
		platforms.add(new Platform(2430, -670, 50, 10));
		platforms.add(new Platform(2220, -850, 50, 10));
		platforms.add(new Platform(1700, -850, 20, 300));// back to level
		platforms.add(new Platform(1700, -550, 300, 20));
		platforms.add(new Platform(2000, -650, 20, 120));
		platforms.add(new Platform(1800, -650, 200, 20));
		spikes.add(new Spike(2100, -580, 10, 180, true));// jump
		platforms.add(new Platform(2180, -560, 20, 20));// jump
		endObject = new EndObject(1950, -630, 50, 80);

	}

	void levelFivePlatforms() {
		previousLevelNumber = 5;
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
		// upper platforms
		platforms.add(new Platform(4700, -50, 20, 10));
		platforms.add(new Platform(4900, -50, 20, 10));
		// middle platform
		platforms.add(new Platform(5100, 150, 100, 10));
		endObject = new EndObject(4810, 150, 50, 50);
	}

	void levelSixPlatforms() {
		previousLevelNumber = 6;
		spikes.add(new Spike(0, 5000, 5500, 50, false));
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
