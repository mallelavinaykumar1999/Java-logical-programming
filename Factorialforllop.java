/*write a program to print factorial of given number using for loop*/
import java.util.*;
class Factorialforllop{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n,fact=1;
    for(; n>0;n-- )
      {
        fact=fact*n;
        
      }
    System.out.println("the factorial of "+ temp+" is: "+fact);
  }
}