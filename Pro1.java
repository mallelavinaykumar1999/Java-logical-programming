/* write a program to print charcter from user*/
import java.util.*;
public class Pro1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your character");
    char c1=sc.next().charAt(0);
     System.out.println(" your character is " + (c1));
  }
  
}