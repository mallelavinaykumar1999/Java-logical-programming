import java.util.*;
class MulticatchException{
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  void Division(){
    try{
      System.out.println("enter your a,b values :");
      a=sc.nextInt();
      b=sc.nextInt();
      c=a/b;
      System.out.println("the division of two numbers is "+c);
      int ar[]=new int[10];
      ar[11]=25;
    }
    catch(ArithmeticException ae){
      System.out.println("exception occur at "+ae.getMessage());
    }
    catch(InputMismatchException be){
      System.out.println("exception occur due to invalid input ");
    }
    catch(ArrayIndexOutOfBoundsException ce){
      System.out.println("exception occur at "+ce.getMessage());
    }
    
  }
  public static void main(String args[]){
    MulticatchException d=new MulticatchException();
    d.Division();
  }
}