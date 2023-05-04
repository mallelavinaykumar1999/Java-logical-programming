/******************************************************************************
Write a JAVAprogram to print all natural numbers in reverse (from n to 1). - using while loop
*******************************************************************************/
import java.util.*;
public class Reversenatural
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your n value : ");
	    int n=sc.nextInt();
	    while(n>0){
	        System.out.print(n+" ");
	        n--;
	    }
	    
	    
		
	}
}
