/******************************************************************************
Write a JAVAprogram to check whether a number is Perfect number or not.
*******************************************************************************/
import java.util.*;
public class perfectnum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++){
	    if(n%i==0){
	        sum+=i;
	    }
	}
	if(n==sum){
	    System.out.println(n+" its perfect num");
	}
	else{
	    System.out.println(n+" its not perfect num");
	}
	}
}
