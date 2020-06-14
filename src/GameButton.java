import java.awt.Color;
import java.awt.Graphics;

public class GameButton extends GameObject {
	String text;
	int textx;
	String color;

	GameButton(int x, int y, String text, int textx, int width, String color) {
		super(x, y, width, 40);
		this.text = text;
		this.textx = textx;

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
		g.setColor(Color.getColor(null));//ask about why this works
		g.drawString(text, textx, y + 29);
		g.drawRoundRect(x, y, width, height, 10, 70);
	}
}
