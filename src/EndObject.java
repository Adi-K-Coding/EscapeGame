import java.awt.Color;
import java.awt.Graphics;

public class EndObject extends GameObject {

	EndObject(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x - ObjectManager.player.x, y - ObjectManager.player.y, width, height);
	}

	void update() {
		super.update();
	}
}
