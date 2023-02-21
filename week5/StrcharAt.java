/******************************************************************************
wrie a Java program to find the character  of string by using charAt() method:

*******************************************************************************/
import java.util.Scanner;
class StrcharAt{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    String St1=n;
    System.out.println("Enter your index position :");
    int i = sc.nextInt();
    System.out.println("The char at given index is:" + n.charAt(i));
    
  }
}