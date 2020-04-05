import java.awt.Color;
import java.awt.Graphics;

public class Platform extends GameObject {

	Platform(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

void draw(Graphics g) {	
	g.setColor(Color.RED);
	g.fillRect(x, y, width, height);
}
}