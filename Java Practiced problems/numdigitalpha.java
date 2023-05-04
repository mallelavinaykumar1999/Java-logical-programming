/******************************************************************************
Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.

*******************************************************************************/
import java.util.*;
public class numdigitalpha
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your character");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=122){
		    System.out.println("its alphabet");
		}
		else if(ch>='0' && ch<='9'){
		    System.out.println("its digit");
		}
		else{
		    System.out.println("its special character");
		}
	}
}