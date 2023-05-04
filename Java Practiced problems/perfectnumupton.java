/******************************************************************************
Write a JAVAprogram to print all Perfect numbers between 1 to n.
*******************************************************************************/
import java.util.*;
public class perfectnumupton
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int num=sc.nextInt();
	for(int j=1;j<=num;j++){
	int sum=0;
	int n=j;
	for(int i=1;i<n;i++){
	    if(n%i==0){
	        sum+=i;
	    }
	}
	if(n==sum){
	    System.out.println(n+" its perfect num");
	}
	
	}
	}
}
