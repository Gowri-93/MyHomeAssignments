package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		String str = "I am a software tester";
		String[] strArray = str.split(" ");
		int length = strArray.length;

		String[] finalArray = new String[length];

		for (int i = 0; i <= length - 1; i++) {
			if (i % 2 != 0) {
				char[] charArray = strArray[i].toCharArray();
				int charLength = charArray.length;

				char[] reverseArray = new char[charLength];

				for (int j = charLength - 1; j >= 0; j--) {
					// Populate reverse array
					reverseArray[charLength - j - 1] = charArray[j];
				}
				// convert the array to string and append it to the finalArray
				finalArray[i] = String.valueOf(reverseArray);

			} else {
				// append strarray it to the finalArray
				finalArray[i] = strArray[i];
			}
		}
		// Convert the finalArray to string and print it
		System.out.println(String.join(" ", finalArray));
	}

}
