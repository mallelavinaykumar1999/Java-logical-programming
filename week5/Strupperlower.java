/******************************************************************************
wrie a Java program to find the uppercase and lowercase  of string by using toUpperCase() and toLowerCase() methods:

*******************************************************************************/
import java.util.Scanner;
class Strupperlower{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    //System.out.println("Enter your index:");
    //int i = sc.nextInt();
    System.out.println("The char given position is:" + n.toUpperCase());
    System.out.println("The char given position is:" + n.toLowerCase());
  }
}