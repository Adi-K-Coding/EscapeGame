import javax.swing.JFrame;
import javax.swing.JPanel;

public class Escape {
	JFrame frame;
	GamePanel gamePanel;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	public static void main(String[] args) {
		Escape escapeGame = new Escape();
		escapeGame.setup();
	}

	void setup() {
		frame.add(gamePanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(gamePanel);
	frame.addMouseListener(gamePanel);
	}

	Escape() {
		frame = new JFrame();
		gamePanel = new GamePanel();
	}
}
