/******************************************************************************
Write a JAVAprogram to print all Strong numbers between 1 to n.
*******************************************************************************/
import java.util.*;
public class Strongnumupton
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int n=sc.nextInt();
	for(int j=1;j<=n;j++){
	    int num=j;
	
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
	
	}
	}
}
