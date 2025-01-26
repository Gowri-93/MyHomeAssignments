package week1.day4;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auenerated method stub
       String companyName="TestLeaf";
       int lengthOfString = companyName.length();
       char[] companyName1 = companyName.toCharArray();
       
       for(int i=lengthOfString-1;i>=0;i--)
       {
       
       System.out.println(companyName1[i]);

	}

}}
