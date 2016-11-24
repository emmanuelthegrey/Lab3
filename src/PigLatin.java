import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		String choice = "y";
		Scanner input = new Scanner(System.in);

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter word to be translated: ");
			System.out.println();
			String english = input.nextLine().toLowerCase();
			int index;
			System.out.println("You printed out: " + english);
			System.out.println();
			
			

			if (english.charAt(0) == 'e' || english.charAt(0) == 'i' || english.charAt(0) == 'a'
					|| english.charAt(0) == 'o' || english.charAt(0) == 'u') {
				english = english + "way";
				System.out.println("Translated: " + english);
				System.out.print("Would you like to enter another word?y/n ");
				choice = input.nextLine();
			} else {

				index = vowelIndex(english);

				String suffix = english.substring(index);
				String prefix = english.substring(0, index);
				String pigLatin = suffix + prefix + "ay";
				// System.out.println(prefix);
				// System.out.println(suffix);
				System.out.println("Translated: " + pigLatin);
				System.out.println();
				System.out.print("Would you like to enter another word? y/n ");
				choice = input.nextLine();
			}
			System.out.println("Goodbye");
		}
		input.close();

	}

	public static int vowelIndex(String word) {
		char chr;
		int index = 0;

		for (int i = 0; i < word.length(); i++) {
			chr = word.charAt(i);
			index = word.indexOf(chr);
			if (chr == 'e' || chr == 'a' || chr == 'i' || chr == 'o' || chr == 'u') {
				return index;
			}

		}
		return index;

	}
}