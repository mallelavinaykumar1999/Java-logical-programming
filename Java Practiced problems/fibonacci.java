/******************************************************************************
Write a JAVAprogram to print Fibonacci series up to n terms
*******************************************************************************/
import java.util.*;
public class fibonacci
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int n=sc.nextInt();
	int n1=1,n2=0,n3=0;
	for(int i=1;i<=n;i++){
	    System.out.print(n3+" ");
	    n3=(n1+n2);
	    n1=n2;
	    n2=n3;
	}
	}
}
