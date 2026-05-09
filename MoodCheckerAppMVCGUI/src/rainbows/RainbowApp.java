package rainbows;

import javax.swing.SwingUtilities;

import rainbows.controller.MoodController;
import rainbows.model.MoodModel;
import rainbows.view.MoodView;

public class RainbowApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MoodModel model = new MoodModel();
			MoodView view = new MoodView();
			new MoodController(model, view);
			view.setVisible(true);
		});
	}

}
