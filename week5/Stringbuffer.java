/******************************************************************************
wrie a Java program to reverse  of string by using stringbuffer class

*******************************************************************************/
import java.util.*;
class Stringbuffer{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     
    System.out.println("enter your String :");
    String s=sc.nextLine();
    StringBuffer st1=new StringBuffer(s);
   
   
    System.out.println("your reverse string is "+st1.reverse());
  }
}