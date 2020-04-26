import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject {
	int direction;
	boolean up;
	boolean down;
	boolean left;
	boolean right;
	double gravity = 1;
	double velocity = 0;

	Player(int x, int y, int direction) {
		super(x, y, 50, 80);
		this.direction = direction;
		speed = 5;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(350, 220, width, height);
	}

	void update() {
		velocity += gravity;
		int dx = 0;
		int dy = (int) velocity;
		collisionBox.setBounds(350, 220, width, height);
		if (up && ObjectManager.isGoingToCollide(0, 1) == true) {
			velocity = -speed * 4;
			dy = (int) velocity;
		}
//		if (down||up) {
//			dy += velocity;
//		}
		if (left) {
			dx = -speed;
		}
		if (right) {
			dx = speed;
		}
		if (ObjectManager.isGoingToCollide(0, dy) == false) {
			this.y += dy;
		}
		if (ObjectManager.isGoingToCollide(dx, 0) == false) {
			this.x += dx;
		}
	}
}
