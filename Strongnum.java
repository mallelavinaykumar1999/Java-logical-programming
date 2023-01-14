/*write a program to write the given number is weather strong numberor not*/
import java.util.*;
public class Strongnum{
  public static void main(String ags[]){
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter your input number");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    int rem;
    int fact=1;
    while (n>0){
      rem=n%10;
      while (rem>0){
        fact=rem*fact;
        rem-=1;
      }
      sum=sum+fact;
      n=n/10;
      fact=1;
    }
    if(temp==sum){
    System.out.println("The given number is Strong Number");
    }
    else{
      System.out.println("The given number is  not Strong Number");
    }
  }
}