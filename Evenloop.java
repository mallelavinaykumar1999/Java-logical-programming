/* write a java program to find the sum of even digits in the given number*/
import java.util.*;
class Evenloop{
  public static void main(String args[]){
    int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int rem;
    int sum=0;
    while(n>0)
      {
       rem=n%10;
       if(rem%2==0){
           sum=sum+rem;
           
       }
       n=n/10;
       
      }
      System.out.println("the sum of even digits in given number is "+ sum);
      
  }
}