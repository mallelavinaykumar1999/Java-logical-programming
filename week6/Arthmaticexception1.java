import java.util.*;
class Arthmaticexception1{
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  void Division(){
    try{
      System.out.println("enter your a,b values :");
      a=sc.nextInt();
      b=sc.nextInt();
      c=a/b;
      System.out.println("the division of two numbers is "+c);
    }
    catch(ArithmeticException ae){
      System.out.println("exception occur at "+ae.getMessage());
    }
    /*catch(InputMismatchException be){
      System.out.println("exception occur due to invalid input ");
    }*/
    
  }
  public static void main(String args[]){
    Arthmaticexception1 d=new Arthmaticexception1();
    d.Division();
  }
}