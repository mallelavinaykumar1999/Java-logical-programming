/******************************************************************************
 Write a JAVAprogram to find first and last digit of a number.
*******************************************************************************/
import java.util.*;
public class firstandlastdigits
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your  num");
	    int num=sc.nextInt();
	   int first=num;
	   while(first>=10){
	       first/=10;
	   }
	   int last=num%10;
	    
	    System.out.println("first digit : "+first);
	    System.out.println("Last digit : "+last);
	    
		
	}
}
