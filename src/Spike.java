import java.awt.Color;
import java.awt.Graphics;

public class Spike extends GameObject {
	public int collisionState = 0;

	boolean isVisible;

	Spike(int x, int y, int width, int height, boolean isVisible) {
		super(x, y, width, height);
		this.isVisible = isVisible;
	}

	void draw(Graphics g) {
		if (isVisible == true) {
			g.setColor(Color.RED);
			g.fillRect(x - ObjectManager.player.x, y - ObjectManager.player.y, width, height);
		}
	}

	void update() {
		super.update();
	}

}
