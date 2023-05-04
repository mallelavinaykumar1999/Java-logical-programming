/******************************************************************************

 Write a JAVAprogram to check whether a number is even or odd.

*******************************************************************************/
import java.util.*;
public class evenorodd
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your  num");
		int num1=sc.nextInt();
		
		if(num1%2==0){
		    System.out.println(num1+" is even");
		}
		else{
		    System.out.println(num1+" is odd");
		}
		
		
	}
}
