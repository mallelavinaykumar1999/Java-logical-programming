/******************************************************************************
Write a JAVAprogram to calculate product of digits of a number.
*******************************************************************************/
import java.util.*;
public class productofdigits
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your  num");
	    int num=sc.nextInt();
	    int temp=num;
	    int num2=1,rem;
	   while(num>0){
	       rem=num%10;
	       num2=(num2)*rem;
	       num/=10;
	   }
	   System.out.println("the product of digits in num is "+num2);
	    
		
	}
}
