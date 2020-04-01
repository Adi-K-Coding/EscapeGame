import java.awt.Color;
import java.awt.Graphics;

public class GameButton extends GameObject {
	// make extend game object class, create gameobject, create constructer that
	// take x and y, make method in game button that asks
	// for x and y and tells if its inside the button
	String text;
	int textx;

	GameButton(int x, int y, String text, int textx) {
		this.x = x;
		this.y = y;
		this.text = text;
		this.textx = textx;
		width = 250;
		height = 40;

	}

	public boolean isOnButton(int x, int y) {
		if (x > this.x && x < this.x + width) {
			if (y > this.y && y < this.y + height) {
				return true;
			}
		}
		return false;
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString(text, textx, y + 30);
		g.drawRoundRect(x, y, width, height, 10, 10);
	}
}
