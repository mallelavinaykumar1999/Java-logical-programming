/* write a program to  print fibonicci series
  0   1   1   2   3   5   8   13  */
import java.util.*;

class Fibonacci{
  public static void main(String args[]){
    int n;
    
    int n1=1;
    int n2=0;
    int n3=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your num");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
     System.out.println(n3);
      n3=n1+n2;
      
      
      n1=n2;
      n2=n3;
      
      
      
    }
  }
}