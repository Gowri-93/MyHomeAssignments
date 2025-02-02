package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class Findintersection {

	public static void main(String[] args) {

		// Declare Array as list1
		List<String> List1 = new ArrayList<String>();
		List1.add("3");
		List1.add("2");
		List1.add("11");
		List1.add("4");
		List1.add("6");
		List1.add("7");

		System.out.println("List1:" + List1);
		// Find the lengthoflist1

		int LengthofList1 = List1.size();
		System.out.println("Length of list1:" + LengthofList1);
		// Declare Array as list1

	 List<String> List2 = new ArrayList<String>();
		List2.add("1");
		List2.add("2");
		List2.add("8");
		List2.add("4");
		List2.add("9");
		List2.add("7");

		System.out.println("List2:" + List2);

		// Find the lengthoflist2

		int LengthofList2 = List2.size();
		System.out.println("Length of list2:" + LengthofList2);

		// Compare both the arrays list

		if (List1.retainAll(List2)) {

			System.out.println(List1);
		}

	}
}
