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
	private int livesLeft = 10;
	int stuckCounter = 0;
	int lastGoodX = 0;
	int lastGoodY = 0;

	Player(int x, int y, int direction) {
		super(x, y, 50, 80);
		this.direction = direction;
		speed = 5;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(350, 220, width, height);
	}

	public void setLivesLeft(int livesLeft) {
		this.livesLeft = livesLeft;
	}

	public int getLivesLeft() {
		return livesLeft;
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
		if (left) {
			dx = -speed;
		}
		if (right) {
			dx = speed;
		}
		boolean collidesHorizontally = ObjectManager.isGoingToCollide(dx, 0);
		boolean collidesVertically = ObjectManager.isGoingToCollide(0, dy);
		boolean collidesDiagonally = ObjectManager.isGoingToCollide(dx, dy);
		if (collidesVertically == false) {
			this.y += dy;
		}
		if (collidesHorizontally == false) {
			this.x += dx;
		}

		if (collidesDiagonally && (collidesHorizontally && collidesVertically)) {
			stuckCounter++;

		}
		if (collidesDiagonally == false) {
			lastGoodX = this.x;
			lastGoodY = this.y;
		}
		if (stuckCounter > 3) {
			x = lastGoodX;
			y = lastGoodY;
			stuckCounter = 0;
		}
	}
}
