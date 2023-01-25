import java.util.*;
class Positive{
  public static void main(String args[]){
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num:");
    a=sc.nextInt();
    
    if(a>0)
      System.out.println("its positive  number");
    else
      System.out.println("its negative number");
  }
}