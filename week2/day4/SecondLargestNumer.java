package week2.day4;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestNumer {

	public static void main(String[] args) {
		//Declare array list
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
	
		System.out.println(array);
		Collections.sort(array);
		

		System.out.println("Sorted array: " +array);
		int Size=array.size();
		System.out.println("Size of array:" +Size);
		
		System.out.println("Second largest number: "+array.get(Size-2));

	
}
}
