/*Write a Program for Swapping of Two number?
  */
import java.util.*;
class Swap1{
  int a,b,t;
    Scanner sc=new Scanner(System.in);
  void swap2(){
     System.out.println("Enter a value");
    a=sc.nextInt();
    System.out.println("Enter b value");
    b=sc.nextInt();
    System.out.println("before swapping a = "+a+ " and b= "+b);
    t=a;
    a=b;
    b=t;
     System.out.println("after  swapping a = "+a+ " and b= "+b);
  }
}
class Swapmethod{
  public static void main(String args[]){
    Swap1 s1=new Swap1();
    s1.swap2();
   
    
  }
}