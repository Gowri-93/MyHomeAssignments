package week1.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int count = 0;
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] array = text.split(" ");
		int lengthOfArray = array.length;

		for (int i = 0; i <= lengthOfArray - 1; i++) {
			for (int j = i + 1; j <= lengthOfArray - 1; j++) {
				if (array[i].equalsIgnoreCase(array[j])) {
					array[j] = " ";
					count++;
				}
			}
		}
		
		if(count > 1) {
			System.out.println(array);

			System.out.println(String.join(" ", array));
		}
	}

}
