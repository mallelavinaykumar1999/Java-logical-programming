/******************************************************************************
Write a JAVAprogram to check whether a number is Prime number or not.

*******************************************************************************/
import java.util.*;
public class primenum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your num");
	int num=sc.nextInt();
	int count=0;
	for(int i=2;i<=(num/2);i++){
	    if(num%i==0){
	        count++;
	    }
	}
	if(count>0){
	    System.out.println("its not  prime number");
	}
	else{
	    System.out.println("its prime number");
	}
	}
}
