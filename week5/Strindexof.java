/******************************************************************************
wrie a Java program to find the index of character   of string by using indexof() method:

*******************************************************************************/
import java.util.Scanner;
class Strindexof{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    String St1=n;
    System.out.println("Enter your char :");
    char i = sc.next().charAt(0);
    System.out.println("The char given position is:" + n.indexOf(i));
    
  }
}