/* write a program to print addition of two numbers from user*/
import java.util.*;
public class Addition{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
     System.out.println("enter b value");
    int b=sc.nextInt();
     System.out.println("the addition of " + a + " and " +b + " is " +(a+b));
    
  }
}