/******************************************************************************
wrie a Java program to find the reverse ofstring:

*******************************************************************************/
import java.util.Scanner;
class Wordsreverse{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    String n1="";
    for(int i=n.length()-1;i>=0;i--){
      n1=n1+n.charAt(i);
    }
    System.out.println("The length of your string :" + n1);
    
  }
}