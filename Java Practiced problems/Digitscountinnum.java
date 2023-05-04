/******************************************************************************
 Write a JAVAprogram to count number of digits in a number.
*******************************************************************************/
import java.util.*;
public class Digitscountinnum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your  num");
	    int n=sc.nextInt();
	   int count=0;
	    while(n>0){
	        count++;
	        n=n/10;
	    }
	    
	    System.out.println("the count digits of num "+count);
	    
		
	}
}
