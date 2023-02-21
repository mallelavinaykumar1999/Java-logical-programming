/* write a java program to print n natural numbers*/
import java.util.*;
class Nnatural{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int i=1;
    while(i<=n)
      {
        System.out.print(" "+i);
        i++;
      }
  }
}