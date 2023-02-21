/*Write a Java Program to print Multiplication Table?*/
import java.util.*;
class Multiplicationtable{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int i=1;
    while(i<=10)
      {
        
        System.out.println(n +" x "+ i +" = " +(n*i));
        
        i++;
      }
  }
}