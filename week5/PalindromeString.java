/******************************************************************************
wrie a Java program  to find the string is palindrome or not:

*******************************************************************************/
import java.util.Scanner;
class PalindromeString{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    String n1="";
    for(int i=n.length()-1;i>=0;i--){
      n1=n1+n.charAt(i);
    }
    if(n1.equalsIgnoreCase(n))
    System.out.println(n+" is palindrome") ;
    else
      System.out.println( n+" is  not palindrome" );
  }
}