/*write a java program to swap of two numbers without third veriable*/
import java.util.*;
class Swap{
  int a,b;
    Scanner sc=new Scanner(System.in);
  void swap(){
    System.out.println("enter a,b values :");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("before swapping a = "+ a +" and b = " + b);
      a=a+b;
      b=a-b;
      a=a-b;
    System.out.println("after swapping a = "+ a +" and b = " + b);
  }
}
class Swapmethod2{
  public static void main(String args[]){
    Swap s1=new Swap();
    s1.swap();
  }
}