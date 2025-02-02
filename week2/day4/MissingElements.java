package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissingElements {

	public static void main(String[] args) {
		//Declare array list
				List<Integer> array = new ArrayList<Integer>();
				array.add(1);
				array.add(2);
				array.add(3);
				array.add(4);
				array.add(10);
				array.add(6);
				array.add(8);
			
				System.out.println(array);
		//Sort the array in ascending order
				Collections.sort(array);
				System.out.println("Sorted array: " +array);
		//Get the size of the array
				int Size=array.size();
				System.out.println("Size of array:" +Size);
		//Compare the current element value with next element value		
				for (int i = 0; i < Size-1; i++) {
					
			    int Currentelement = array.get(i);
				int nextelement=array.get(i+1);
				
				if (nextelement!=Currentelement+1)
					System.out.println(Currentelement+1);
				}

	}

}
