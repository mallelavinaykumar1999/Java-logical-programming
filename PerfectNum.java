/* write a program to find weather the given number is perfect or not*/
import java.util.*;
public class PerfectNum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    int i=1;
    while(i<n){
      if(n%i==0){
        sum=sum+i;
      }
      i+=1;
    }
    if(temp==sum){
    System.out.println("It is a perfect number");
    }
    else{
      System.out.println("It is not perfect number");
    }
  }
}