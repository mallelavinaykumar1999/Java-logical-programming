/******************************************************************************
wrie a Java program to find the length  of string by using length() method:

*******************************************************************************/
import java.util.Scanner;
class Strlength{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    System.out.println("The length of your string :" + n.length());
    
  }
}