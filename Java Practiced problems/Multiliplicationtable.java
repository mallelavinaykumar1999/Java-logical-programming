/******************************************************************************
Write a JAVAprogram to print multiplication table of any number.
*******************************************************************************/
import java.util.*;
public class Multiliplicationtable
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your multliplication table num");
	    int n=sc.nextInt();
	   
	    for(int i=1;i<=10;i++){
	        System.out.println(n+" X "+i+" = "+(n*i));
	    }
	    
	    
	    
		
	}
}
