package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class SpeakAndSpell {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "World of Warcraft spelling challenge");
		String[] wordsToSpell = { "Khadgar", "Arthas", "Illidan Stormrage ", "Anduin Lothar", "Thrall" };
		int score = 0;
		for (int i = 0; i < wordsToSpell.length; i++) {
			speak("spell " + wordsToSpell[i]);
			String answer = JOptionPane.showInputDialog("Spell the name");

			if (answer.equals(wordsToSpell[i])) {
				JOptionPane.showMessageDialog(null, "Nice spelling! Correct!");
				score++;
			} else {
				JOptionPane.showMessageDialog(null, "Try harder! Wrong answer!");
			}

		}

		JOptionPane.showMessageDialog(null, "Your final score is " + score);

	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
