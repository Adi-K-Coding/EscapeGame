import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ObjectManager implements ActionListener {

	static ArrayList<Platform> platforms = new ArrayList<Platform>();
	static ArrayList<Spike> spikes = new ArrayList<Spike>();
	public static Player player;
	public static EndObject endObject;
	int levelNumber = 1;
	int previousLevelNumber = 1;
	boolean level2Unlocked = false;
	boolean level3Unlocked = false;
	boolean level4Unlocked = false;
	boolean level5Unlocked = false;
	boolean level6Unlocked = false;
	boolean level6Beaten = false;

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
		spikes.add(new Spike(2700, 20, 120, 10, true));
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
		spikes.add(new Spike(1600, -200, 10, 100, true));
		spikes.add(new Spike(1750, -380, 10, 100, true));
		spikes.add(new Spike(1900, -200, 10, 100, true));
		spikes.add(new Spike(2050, -380, 10, 100, true));
		spikes.add(new Spike(2200, -200, 10, 100, true));
		spikes.add(new Spike(2220, -390, 100, 10, true));
		platforms.add(new Platform(2480, -1100, 20, 1000));
		spikes.add(new Spike(2470, -1080, 10, 980, true));
		platforms.add(new Platform(1500, -1100, 1000, 20));
		platforms.add(new Platform(1500, -1100, 20, 700));
		platforms.add(new Platform(1500, -400, 700, 20));
		platforms.add(new Platform(2200, -850, 20, 470));
		spikes.add(new Spike(2220, -840, 10, 460, true));
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
		spikes.add(new Spike(0, 5000, 7000, 50, false));
		// cheat
//		platforms.add(new Platform(0, 700, 6000, 3));
//		platforms.add(new Platform(6000, -2000, 3, 3000));
//		platforms.add(new Platform(2600, -1500, 2900, 3));
//		platforms.add(new Platform(2100, -1300, 100, 3));
//		platforms.add(new Platform(800, -1500, 1200, 3));
//		platforms.add(new Platform(3400, -1600, 100, 3));
		// jumps to right
		platforms.add(new Platform(100, 500, 500, 600));
		platforms.add(new Platform(810, 500, 100, 20));
		platforms.add(new Platform(1120, 489, 100, 20));
		platforms.add(new Platform(1430, 474, 100, 20));
		platforms.add(new Platform(1740, 530, 100, 20));
		platforms.add(new Platform(2050, 492, 100, 20));
		platforms.add(new Platform(2360, 468, 100, 20));
		platforms.add(new Platform(2670, 486, 100, 20));
		platforms.add(new Platform(2980, 500, 100, 20));
		platforms.add(new Platform(3290, 550, 100, 20));
		platforms.add(new Platform(3600, 600, 100, 20));
		platforms.add(new Platform(3910, 650, 100, 20));
		platforms.add(new Platform(4220, 700, 80, 20));
		// small box
		platforms.add(new Platform(4300, 700, 500, 20));
		platforms.add(new Platform(4800, 450, 20, 270));
		platforms.add(new Platform(4300, 320, 520, 20));
		platforms.add(new Platform(4300, 320, 20, 255));
		platforms.add(new Platform(4300, 570, 400, 20));
		platforms.add(new Platform(4420, 450, 400, 20));
		// continue jumps
		platforms.add(new Platform(4900, 500, 120, 20));
		platforms.add(new Platform(5250, 500, 120, 20));
		platforms.add(new Platform(5600, 500, 120, 20));
		// outer bounds of big rectangle
		platforms.add(new Platform(620, 0, 4980, 20));// lower
		spikes.add(new Spike(600, 20, 5000, 20, true));// lower
		spikes.add(new Spike(5600, -1220, 20, 1260, true));// right
		platforms.add(new Platform(800, -1220, 4800, 20));// upper
		spikes.add(new Spike(800, -1240, 4820, 20, true));// upper
		spikes.add(new Spike(600, -1800, 20, 1820, true));// left
		// spikes.add(new Spike(600, -1600, 20, 1600, true));
		// jumps up
		platforms.add(new Platform(5800, 300, 100, 20));
		platforms.add(new Platform(5820, 100, 100, 20));
		platforms.add(new Platform(5800, -100, 100, 20));
		platforms.add(new Platform(5820, -300, 100, 20));
		platforms.add(new Platform(5800, -500, 100, 20));
		platforms.add(new Platform(5820, -700, 100, 20));
		platforms.add(new Platform(5800, -900, 100, 20));
		platforms.add(new Platform(5820, -1100, 100, 20));
		platforms.add(new Platform(5800, -1300, 100, 20));
		// jumps to entrance
		platforms.add(new Platform(5600, -1350, 100, 20));
		platforms.add(new Platform(5400, -1300, 20, 20));
		platforms.add(new Platform(5200, -1368, 29, 10));
		platforms.add(new Platform(5000, -1418, 27, 12));
		spikes.add(new Spike(4900, -1570, 20, 340, true));
		platforms.add(new Platform(4800, -1320, 22, 11));
		platforms.add(new Platform(4600, -1378, 25, 19));
		platforms.add(new Platform(4400, -1436, 11, 24));
		platforms.add(new Platform(4200, -1499, 20, 12));
		spikes.add(new Spike(4100, -1600, 20, 380, true));
		platforms.add(new Platform(4000, -1320, 19, 28));
		platforms.add(new Platform(3800, -1378, 22, 11));
		platforms.add(new Platform(3600, -1436, 20, 12));
		platforms.add(new Platform(3400, -1499, 30, 27));
		spikes.add(new Spike(3300, -1660, 20, 420, true));
		platforms.add(new Platform(3200, -1320, 25, 28));
		platforms.add(new Platform(3000, -1386, 29, 11));
		platforms.add(new Platform(2800, -1458, 17, 23));
		platforms.add(new Platform(2600, -1499, 21, 27));
		spikes.add(new Spike(2500, -1550, 20, 320, true));
		platforms.add(new Platform(2340, -1300, 100, 20));
		spikes.add(new Spike(2300, -1400, 20, 180, true));
		spikes.add(new Spike(2300, -1800, 20, 200, true));
		platforms.add(new Platform(2200, -1320, 13, 17));
		platforms.add(new Platform(2000, -1386, 14, 10));
		platforms.add(new Platform(1800, -1458, 29, 14));
		platforms.add(new Platform(1600, -1499, 25, 17));
		spikes.add(new Spike(1500, -1550, 20, 320, true));
		spikes.add(new Spike(1500, -2050, 20, 250, true));
		platforms.add(new Platform(1400, -1320, 12, 20));
		platforms.add(new Platform(1200, -1386, 16, 19));
		platforms.add(new Platform(1000, -1458, 23, 18));
		platforms.add(new Platform(800, -1499, 28, 24));
		// leading down into interior
		platforms.add(new Platform(670, -1299, 20, 20));
		platforms.add(new Platform(720, -1055, 20, 20));
		platforms.add(new Platform(670, -860, 20, 20));
		// interior
		platforms.add(new Platform(600, -600, 3500, 20));
		spikes.add(new Spike(1000, -780, 20, 180, true));
		spikes.add(new Spike(1000, -1200, 20, 250, true));
		spikes.add(new Spike(1500, -740, 20, 140, true));
		spikes.add(new Spike(1500, -1200, 20, 300, true));
		platforms.add(new Platform(1850, -800, 75, 10));
		spikes.add(new Spike(2000, -980, 20, 380, true));
		spikes.add(new Spike(2000, -1200, 20, 50, true));
		// spike snake maze
		spikes.add(new Spike(2500, -1200, 2100, 307, true));
		spikes.add(new Spike(2600, -750, 10, 150, true));
		spikes.add(new Spike(2700, -913, 10, 150, true));
		spikes.add(new Spike(2800, -750, 10, 150, true));
		spikes.add(new Spike(2900, -913, 10, 150, true));
		spikes.add(new Spike(3000, -750, 10, 150, true));
		spikes.add(new Spike(3100, -913, 10, 150, true));
		spikes.add(new Spike(3200, -750, 10, 150, true));
		// spike avoid jumps
		spikes.add(new Spike(4080, -580, 20, 380, true));
		spikes.add(new Spike(4080, -220, 1400, 20, true));
		spikes.add(new Spike(4580, -1180, 20, 650, true));
		spikes.add(new Spike(5080, -900, 20, 700, true));
		platforms.add(new Platform(4150, -400, 5, 10));
		platforms.add(new Platform(4367, -350, 5, 10));
		platforms.add(new Platform(4422, -443, 5, 10));
		platforms.add(new Platform(4542, -232, 5, 10));
		platforms.add(new Platform(4675, -263, 5, 10));
		platforms.add(new Platform(4799, -343, 5, 10));
		platforms.add(new Platform(4949, -412, 5, 10));
		platforms.add(new Platform(4822, -589, 5, 10));
		platforms.add(new Platform(4723, -643, 5, 10));
		platforms.add(new Platform(5000, -776, 5, 10));
		platforms.add(new Platform(4814, -832, 5, 10));
		// spike avoid drop
		platforms.add(new Platform(5129, -839, 140, 10));
		platforms.add(new Platform(5488, -632, 75, 10));
		spikes.add(new Spike(5200, -750, 200, 10, true));
		platforms.add(new Platform(5452, -436, 105, 10));
		spikes.add(new Spike(5300, -450, 100, 10, true));
		platforms.add(new Platform(5211, -436, 55, 10));
		platforms.add(new Platform(5132, -336, 20, 10));
		platforms.add(new Platform(5167, -236, 55, 10));
		platforms.add(new Platform(5297, -236, 170, 10));
		// to get to ending
		platforms.add(new Platform(4080, -200, 1400, 10));
		spikes.add(new Spike(4900, -10, 10, 10, true));
		spikes.add(new Spike(5100, -10, 10, 10, true));
		spikes.add(new Spike(4600, -10, 10, 10, true));
		spikes.add(new Spike(4400, -10, 10, 10, true));
		spikes.add(new Spike(4100, -10, 10, 10, true));
		platforms.add(new Platform(3700, -100, 200, 10));
		platforms.add(new Platform(3500, -200, 200, 10));
		platforms.add(new Platform(3300, -300, 200, 10));
		spikes.add(new Spike(3300, -290, 10, 300, true));
		// ending
		endObject = new EndObject(3100, -100, 50, 100);
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
				platforms.get(k).collisionState = 1;

			} else {
				platforms.get(k).collisionState = 0;
			}
		}
		if (endObject.collisionBox.intersects(player.collisionBox)) {
			if (previousLevelNumber == 1) {
				level2Unlocked = true;
			} else if (previousLevelNumber == 2) {
				level3Unlocked = true;
			} else if (previousLevelNumber == 3) {
				level4Unlocked = true;
			} else if (previousLevelNumber == 4) {
				level5Unlocked = true;
			} else if (previousLevelNumber == 5) {
				level6Unlocked = true;
			} else if (previousLevelNumber == 6) {
				level6Beaten = true;
			}

			levelNumber = 0;
			createLevel(levelNumber);
		}
		for (int o = 0; o < spikes.size(); o++) {

			if (player.collisionBox.intersects(spikes.get(o).collisionBox)) {
				player.isAlive = false;
				player.setLivesLeft(player.getLivesLeft() - 1);
			}
		}
	}

	public static boolean isGoingToCollide(int dx, int dy) {
		Rectangle playerPredictPostition = new Rectangle(player.collisionBox.x + dx, player.collisionBox.y + dy,
				player.collisionBox.width, player.collisionBox.height);
		for (int k = 0; k < platforms.size(); k++) {
			if (playerPredictPostition.intersects(platforms.get(k).collisionBox)) {
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
