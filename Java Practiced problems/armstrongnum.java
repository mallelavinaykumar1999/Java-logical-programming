/******************************************************************************
Write a JAVAprogram to check whether a number is Armstrong number or not.
*******************************************************************************/
import java.util.*;
public class armstrongnum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int num=sc.nextInt();
	String s1=""+num;
	int temp=num;
	int rem;
	double sum=0;
	while(num>0){
	    rem=num%10;
	    sum+=Math.pow(rem,s1.length());
	    num/=10;
	}
	if(sum==temp){
	    System.out.println("its armstrong num");
	}
	else{
	    System.out.println("its not armstrong num");
	}
	
	}
}
