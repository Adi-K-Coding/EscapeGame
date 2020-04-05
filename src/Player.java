import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {
	int direction;

	Player(int x, int y, int direction) {
		super(x, y, 50, 100);
		this.direction = direction;
		speed = 10;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

	public void up() {
		y = y - speed;
	}

	public void down() {
		y = y + speed;
	}

	public void left() {
		x = x - speed;
	}

	public void right() {
		x = x + speed;
	}

}
