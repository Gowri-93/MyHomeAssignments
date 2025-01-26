package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potssq";
		int lengthOfText1=text1.length();
		int lengthOfText2=text2.length();
		char[] array1=text1.toCharArray();
		char[] array2=text2.toCharArray();
	    Arrays.sort(array1);
	    Arrays.sort(array2);
	    
//Method 1
	    
	    String a1 = Arrays.toString(array1);
	    		String a2 = Arrays.toString(array2);
	    				System.out.println(a1);
	    				System.out.println(a2);
	    				
	    				if(a1.equals(a2)) {
	    					System.out.println( "Match");

	    				} else {
	    					System.out.println( "Not Match");

	    				}

//Method 2
	    if (lengthOfText1!=lengthOfText2)
	    {
			
			System.out.println( "The given strings are not an Anagram.");
	    }
	    else
	    {
	    	
		    for (int i=0;i<=lengthOfText1-1;i++)
		    {
		     if (array1[i]!=array2[i]) //&& i==(lengthOfText1-1))
		     {
		    	 System.out.println( "The given strings are not an Anagram."); 
		    	 break;
		     }
		     else {
		    	 if(i==(lengthOfText1-1)) {
		    		 System.out.println( "The given strings are an Anagram."); 
		    	 }
		     }
			}
	    }
	}
}

