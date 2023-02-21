/* write a java program to print sum of  n natural numbers*/
import java.util.*;
class Sumofnatural{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int i=1,sum=0;
    while(i<=n)
      {
        sum+=i;
        
        i++;
      }
    System.out.println("the sum of n natural number is: "+sum);
  }
}