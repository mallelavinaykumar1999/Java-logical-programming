/******************************************************************************
Write a JAVAprogram to enter a number and print its reverse.
*******************************************************************************/
import java.util.*;
public class reverseofnum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your  num");
	    int num=sc.nextInt();
	    int temp=num;
	    int num2=0,rem;
	   while(num>0){
	       rem=num%10;
	       num2=(num2*10)+rem;
	       num/=10;
	   }
	   System.out.println("the product of digits in num is "+num2);
	    
		
	}
}
