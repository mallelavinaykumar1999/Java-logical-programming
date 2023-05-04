/******************************************************************************
Write a JAVAprogram to print all Prime numbers between 1 to n.

*******************************************************************************/
import java.util.*;
public class 1tonprimenum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int n=sc.nextInt();
	for(int j=1;j<=n;j++){
    int num=j;
	int count=0;
	for(int i=2;i<=(num/2);i++){
	    if(num%i==0){
	        count++;
	    }
	}
	if(count==0){
	    System.out.println(num);
	}
	}
	
	}
}
