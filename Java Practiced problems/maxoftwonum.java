/******************************************************************************

   Write a JAVAprogram to find maximum between two numbers.

*******************************************************************************/
import java.util.*;
public class maxoftwonum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your first num");
		int num1=sc.nextInt();
		System.out.println("enter your second num");
		int num2=sc.nextInt();
		if(num1>num2){
		    System.out.println("the maximum number is "+num1);
		}
		else{
		    System.out.println("the maximum number is "+num2);
		}
	}
}
