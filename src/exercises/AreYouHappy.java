package exercises;

import javax.swing.JOptionPane;


public class AreYouHappy {

	public static void main(String[] args) {
		String answer1 = JOptionPane.showInputDialog("Are you happy?");
		if (answer1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing! Life is great! ");

		} else if (answer1.equals("no")) {
			String answer3 = JOptionPane.showInputDialog("Do you want to be happy? ");
			if (answer3.contentEquals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something life is too short! ");

			} else if (answer3.contentEquals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing! Whatever makes you happy! ");
			}

			else {
				JOptionPane.showMessageDialog(null, "You must input yes or no ");
			}

		} else {
			JOptionPane.showMessageDialog(null, "You must input yes or no ");
		}
	}
}
