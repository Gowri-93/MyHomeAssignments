package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOfElements {

	public static void main(String[] args) {
		List<String> Array = new ArrayList<String>();
		Array.add("HCL");
		Array.add("Wipro");
		Array.add("Aspire Systems");
		Array.add("CTS");
//Sort the array list
		Collections.sort(Array);

		System.out.println("Sorted Array:" + Array);
//Size of the list
		int size = Array.size();
		System.out.println("Size: " + size);

//Reverse the order
		List<String> ReversedArrayList = new ArrayList<String>();
		for (int i = size - 1; i >= 0; i--)

		{
			String ReversedArray = Array.get(i);
			ReversedArrayList.add(ReversedArray);

		}
		System.out.println("ReversedArray:" + ReversedArrayList);
	}

}
