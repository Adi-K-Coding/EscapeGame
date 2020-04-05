import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObjectManager implements ActionListener {

	ArrayList<Platform> platforms = new ArrayList<Platform>();
	Player player;

	ObjectManager(Player player) {
		platforms.add(new Platform(400, 300, 200, 20));
		this.player=player;
	}

	void draw(Graphics g) {
		player.draw(g);
		for (int i = 0; i < platforms.size(); i++) {
			platforms.get(i).draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
