/******************************************************************************

  Write a JAVAprogram to find maximum between three numbers.

*******************************************************************************/
import java.util.*;
public class maxofthreenum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your first num");
		int num1=sc.nextInt();
		System.out.println("enter your second num");
		int num2=sc.nextInt();
		System.out.println("enter your third num");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3){
		    System.out.println("the maximum number is "+num1);
		}
		else if(num2>num3){
		    System.out.println("the maximum number is "+num2);
		}
		else{
		    System.out.println("the maximum number is "+num3);
		}
		}
		
	}
}
