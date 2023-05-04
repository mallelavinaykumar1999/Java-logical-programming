/******************************************************************************
Write a JAVAprogram to check whether a number is palindrome or not.
*******************************************************************************/
import java.util.*;
public class Palindrome
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
	   if(num2==temp){
	       System.out.println("its palindrome");
	   }
	   else{
	       System.out.println("its not palindrome");
	   }
	    
		
	}
}
