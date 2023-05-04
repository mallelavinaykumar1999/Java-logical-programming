/******************************************************************************
Write a JAVAprogram to check whether a number is Strong number or not.
*******************************************************************************/
import java.util.*;
public class Strongnum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int num=sc.nextInt();
	int temp=num;
	int sum=0,rem,fact=1;
	while(num>0){
	    fact=1;
	    rem=num%10;
	    for(int i=rem;i>0;i--){
	        fact*=i;
	    }
	    sum+=fact;
	    num/=10;
	}
	if(temp==sum){
	    System.out.println(temp+" its strong num");
	}
	else{
	    System.out.println(temp+" its not strong num");
	}
	}
}
