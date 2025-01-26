package week1.day3;


import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int input[]={1,4,3,2,8,6,7};
		int l=input.length;
		Arrays.sort(input);
				
		for(int i=1;i<l-1;i++)
			
			if(i!=input[i-1])
				
				System.out.println("Missing number: "+i);
			
		
	}

}
