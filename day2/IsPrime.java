package week1.day2;

public class IsPrime
{

	public static void main(String[] args) 
	{
		int n=10;
        for (int i =2;i < n-1;i++)
         {
		  	if(n%i==0)
		  	{
				System.out.println(n+ "Number is not Prime");	
	            break;
		  	}	
	    else 
	         {
	 	System.out.println(n+ "Number is Prime");
             }
         }
     }

}