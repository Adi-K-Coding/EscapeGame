import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener {
	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}
	}

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font titleFontTwo;
	Timer frameDraw;
	// BUTTONS ON MENU
	GameButton startButton = new GameButton(272, 250, "Start", 367);
	GameButton ccButton = new GameButton(272, 300, "Change Character", 285);
	GameButton instructionButton = new GameButton(272, 350, "Instructions", 321);
	// PLAYER OBJECT
	Player player = new Player(0, 0, 0);
	ObjectManager objectManager = new ObjectManager(player);

	// GamePanel Constructor

	GamePanel() {
		titleFont = new Font("Roboto", Font.PLAIN, 72);
		titleFontTwo = new Font("Roboto", Font.CENTER_BASELINE, 24);
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {
		objectManager.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		// these two lines change background color of menu use for game and end states
		// as well
		g.setColor(Color.darkGray);
		g.fillRect(0, 0, Escape.WIDTH, Escape.HEIGHT);
		// next two lines set font, font color, third is string and location
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Escape", 275, 150);
		// Start, Change Character, and Instruction Buttons
		g.setFont(titleFontTwo);
		startButton.draw(g);
		ccButton.draw(g);
		instructionButton.draw(g);
	}

	void drawGameState(Graphics g) {
		objectManager.draw(g);

	}

	void drawEndState(Graphics g) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (currentState == GAME) {
			if (e.getKeyCode() == KeyEvent.VK_W) {
				System.out.println("UP");

				player.up = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				System.out.println("DOWN");
				player.down = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				System.out.println("LEFT");
				player.left = true;

			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				System.out.println("RIGHT");
				player.right = true;

			}
			// temporary code for switching screens
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				currentState = MENU;
			}
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				currentState = GAME;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			objectManager.levelNumber = 1;
			objectManager.addPlatform(1);
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			objectManager.levelNumber = 2;
			objectManager.addPlatform(2);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (currentState == GAME) {
			if (e.getKeyCode() == KeyEvent.VK_W) {
				System.out.println("UP");

				player.up = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				System.out.println("DOWN");
				player.down = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				System.out.println("LEFT");
				player.left = false;

			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				System.out.println("RIGHT");
				player.right = false;

			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (currentState == MENU) {
			if (startButton.isOnButton(e.getX(), e.getY())) {
				currentState = GAME;
				System.out.println("Start");
			}
			if (ccButton.isOnButton(e.getX(), e.getY())) {
				System.out.println("Change Character");
			}
			if (instructionButton.isOnButton(e.getX(), e.getY())) {
				System.out.println("Instructions");
				JOptionPane.showMessageDialog(null, "Move your character using the arrow keys.\n"
						+ "Use your mouse to aim and use press KEY to shoot. ");
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
