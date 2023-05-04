/******************************************************************************
Write a JAVAprogram to find length of a string and compare and concatenate two strings.
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your first String");
	    String st1=sc.next();
	    System.out.println("enter your second String");
	    String st2=sc.next();
	    System.out.println(st1+" length is "+st1.length());
	    System.out.println(st2+" length is "+st2.length());
	    
	    if(st1.length()>st2.length()){
	        System.out.println("your highest String is "+st1);
	    }
	    else if(st2.length()>st1.length()){
	        System.out.println("your highest String is "+st2);
	    }
	    else{
	        System.out.println("both Strings are equal");
	    }
		System.out.println("concatenation of two Strings is :"+ (st1+" " +st2));
	}
}
