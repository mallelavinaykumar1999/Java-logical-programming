/*write a program to print factorial of given number*/
import java.util.*;
class Factorial{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n,fact=1;
    while(n>0)
      {
        fact=fact*n;
        
        n--;
      }
    System.out.println("the factorial of "+ temp+" is: "+fact);
  }
}