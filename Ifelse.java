import java.util.*;
class Ifelse{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b:");
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>b)
      System.out.println("the biggest value is "+a);
    else
      System.out.println("the biggest value is "+b);
  }
}