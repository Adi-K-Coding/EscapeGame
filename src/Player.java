import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject {
	int direction;
	boolean up;
	boolean down;
	boolean left;
	boolean right;

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
		int dx = 0;
		int dy = 0;
		collisionBox.setBounds(350, 220, width, height);
		if (up) {
			dy = -speed;
		}
		if (down) {
			dy = speed;
		}
		if (left) {
			dx = -speed;
		}
		if (right) {
			dx = speed;
		}
		if(ObjectManager.isGoingToCollide(dx,dy)==false) {
			this.x+=dx;
			this.y+=dy;
		}
	}
}
