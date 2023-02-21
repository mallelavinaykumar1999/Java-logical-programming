/******************************************************************************
wrie a Java program to find the substring   of string by using substring() method:

*******************************************************************************/
import java.util.Scanner;
class Strsubstring{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    System.out.println("Enter your index:");
    int i = sc.nextInt();
    System.out.println("The char given position is:" + n.substring(i));
    
  }
}