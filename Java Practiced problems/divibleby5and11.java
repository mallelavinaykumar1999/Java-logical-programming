/******************************************************************************

  Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not.

*******************************************************************************/
import java.util.*;
public class divibleby5and11
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your  num");
		int num1=sc.nextInt();
		
		if(num1%5==0 && num1%11==0){
		    System.out.println(num1+" is divible by 5 and 11");
		}
		else{
		    System.out.println(num1+" is cannot divisible by 5 and 11");
		}
		
		
	}
}
