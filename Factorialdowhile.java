/*write a program to print factorial of given number using do while loop*/
import java.util.*;
class Factorialdowhile{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n,fact=1;
    do
      {
        fact=fact*n;
        
        n--;
      }while(n>0);
    System.out.println("the factorial of "+ temp+" is: "+fact);
  }
}