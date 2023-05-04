/******************************************************************************
Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your character");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z'){
		    System.out.println("its lower case");
		}
		else if(ch>='A' && ch<='Z'){
		    System.out.println("its upper case");
		}
		else{
		    System.out.println("invalid input");
		}
	}
}
