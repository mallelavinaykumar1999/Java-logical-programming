/*write a program to check given number is prime or not*/
import java.util.*;
class Primenumber{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int c=0;
    int i=1;
    while(i<=n)
      {
        if(n%i==0){
          c+=1;
        }
        
        i++;
      }
    if(c==2)
    System.out.println(n+" is prime number");
    else
      System.out.println(n+" is  not prime number");
  }
}