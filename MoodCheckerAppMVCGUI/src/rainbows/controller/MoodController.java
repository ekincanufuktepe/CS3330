package rainbows.controller;

import rainbows.model.MoodModel;
import rainbows.view.MoodView;

public class MoodController {
	
	private MoodModel model;
	private MoodView view;
	
	public MoodController(MoodModel model, MoodView view) {
		this.model = model;
		this.view = view;
		view.addNewMoodListener(e -> updateMood());
	}
	
	private void updateMood() {
		String selectedMood = view.getSelectedMood();
		model.setMood(selectedMood);
		view.setMoodColor(model.getMoodColor());
		view.setMessage(model.getMoodMessage());
	}

}
