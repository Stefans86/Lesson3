package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100);
		System.out.println(number);
		int x = 0;
		JOptionPane.showMessageDialog(null, "Good luck, may the force be with you!");
		for (int i = 0; i < 5; i++) {
			String question = JOptionPane.showInputDialog("Guess number");
			int guess = Integer.parseInt(question);

			if (guess == number) {
				JOptionPane.showMessageDialog(null, "You are so lucky! It's correct!");
				System.exit(0);
			} else if (guess >= number - 5 && guess < number) {
				JOptionPane.showMessageDialog(null,
						"Close, but lower. You have " + (4 - i) + " tries." + " Try harder!");
				x++;
			} else if (guess < number - 5) {
				JOptionPane.showMessageDialog(null,
						"It's getting colder, too low. You have " + (4 - i) + " tries." + "Try to focus");
				x++;
			} else if (guess <= number + 5 && guess > number) {
				JOptionPane.showMessageDialog(null,
						"Close, but higher. You have " + (4 - i) + " tries." + " Try harder!");
				x++;
			} else if (guess > number + 5) {
				JOptionPane.showMessageDialog(null,
						"It's getting colder " + " too high" + (4 - i) + " tries." + "Try to focus");
				x++;

			}
			if (x == 5) {
				JOptionPane.showInternalMessageDialog(null, "No more tryes, we dont have whole day. You lost 0(olo)0");
			}
		}

	}
}
