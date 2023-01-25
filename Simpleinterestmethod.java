/* Write a Program to enter principle amount, Total Number of Months, and Rate of Intrest , Calculate Simple Intrest      & Total Amount?*/
import java.util.*;
class Simple{
  Float p,t,r,tot_amt;
    Float si;
    Scanner sc=new Scanner(System.in);
    void interest(){
     System.out.println("enter your amount :");
    p=sc.nextFloat();
    System.out.println("enter your time in months :");
    t=sc.nextFloat();
    System.out.println("enter rate of interest :");
    r=sc.nextFloat();
    si=(p*t*r)/(12*100);
    tot_amt=p+si;
    System.out.println("your simple interest is " +si);
    System.out.println("your total amount is " +tot_amt); 
    }
  
}



class Simpleinterestmethod{
  public static void main(String aegs[]){
    Simple s1=new Simple();
    s1.interest();
  }
}