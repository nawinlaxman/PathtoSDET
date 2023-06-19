package mandatoryHomeWork.week1.day5;
import java.util.Scanner;

public class DiamondPatternAtoZ {

	public static void main(String[] args) {

		diamondPattern();
	}

	public static void diamondPattern() {

		char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int letter_number = 0;

		// array of strings
		String[] diamond = new String[26];
		// get the letter
		System.out.print("Enter a Char between A to Z : ");

		Scanner reader = new Scanner(System.in);
		try {
			char user_letter = reader.next("[A-Z]").charAt(0);
			// search for letter number in the array letter
			for (int i = 0; i < letter.length; i++) {
				if (letter[i] == user_letter) {
					letter_number = i;
					break;
				}
			}

			// construct diamond
			for (int i = 0; i <= letter_number; i++) {
				diamond[i] = "";
				// add initial spaces
				for (int j = 0; j < letter_number - i; j++) {
					diamond[i] += " ";
				}

				// add letter (first time)
				diamond[i] += letter[i];

				// add space between letters
				if (letter[i] != 'A') {
					for (int j = 0; j < 2 * i - 1; j++) {
						diamond[i] += " ";
					}
					// add letter (second time)
					diamond[i] += letter[i];
				}
				// Draw the first part of the diamond as it's composing.
				System.out.println(diamond[i]);
			}

			for (int i = letter_number - 1; i >= 0; i--) {
				// Draw the second part of the diamond
				// Writing the diamondArray in reverse order.
				System.out.println(diamond[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}

	}

}
