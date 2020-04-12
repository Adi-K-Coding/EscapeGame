import java.awt.Color;
import java.awt.Graphics;

public class Platform extends GameObject {
	public int collisionState=0;

	Platform(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	void draw(Graphics g) {
		if(collisionState==0) {
		g.setColor(Color.GREEN);
		}else {
			g.setColor(Color.RED);
		}
		g.fillRect(x - ObjectManager.player.x, y - ObjectManager.player.y, width, height);
	}

	void update() {
		collisionBox.setBounds(x - ObjectManager.player.x, y - ObjectManager.player.y, width, height);
	}
}