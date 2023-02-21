/*write a program to print factorial of given number in different method*/
import java.util.*;
class Factorial2{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int fact=1;
    int i=1;
    while(i<=n)
      {
        fact=fact*i;
        
        i++;
      }
    System.out.println("the factorial of "+ n+" is: "+fact);
  }
}