import java.awt.Color;
import java.awt.Graphics;

public class GameButton extends GameObject {
	String text;
	int textx;
	Color color;

	GameButton(int x, int y, String text, int textx, int width, Color color) {
		super(x, y, width, 40);
		this.text = text;
		this.textx = textx;
		this.color = color;
	}

	public boolean isOnButton(int x, int y) {
		if (x > this.x && x < this.x + width) {
			if (y > this.y + 25 && y < this.y + height + 25) {
				return true;
			}
		}
		return false;
	}

	void draw(Graphics g) {
		g.setColor(color);
		g.drawString(text, textx, y + 29);
		g.drawRoundRect(x, y, width, height, 10, 70);
	}
}
