import java.awt.Color;
import java.awt.Graphics;

public class Spike extends GameObject {
	public int collisionState = 0;

	Spike(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x - ObjectManager.player.x, y - ObjectManager.player.y, width, height);
	}

	void update() {
		super.update();
	}

}
