package rainbows.model;

import java.awt.Color;

public class MoodModel {
	
	private String mood;

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
	
	public Color getMoodColor() {
		if(mood == null) 
			return Color.LIGHT_GRAY;

		switch(mood) {
			case "Calm":
				return new Color(135, 45, 230);
			case "Energetic":
				return new Color(255, 255, 0);
			case "Focused":
				return new Color(4, 152, 75);
			case "Happy":
				return new Color(100, 100, 100);
			default:
				return Color.LIGHT_GRAY;
		}
	}

	public String getMoodMessage() {
		if(mood == null) 
			return "Choose a mood to begin";
		switch(mood) {
			case "Calm":
				return "Waves crashing on the beach";
			case "Energetic":
				return "Good morning";
			case "Focused":
				return "Unblinking stare";
			case "Happy":
				return ":)";
			default:
				return "Choose a mood to begin";
		}
	}
	
}
