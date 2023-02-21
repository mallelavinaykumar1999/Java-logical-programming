/* write a java program to print only even number upto n number*/
import java.util.*;
class Even{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int i=1;
    while(i<=n)
      {
        if(i%2==0){
        System.out.print(" "+i);
        }
        i++;
      }
  }
}