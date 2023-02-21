/******************************************************************************
wrie a Java program to find the length  of string without  using length() method:

*******************************************************************************/
import java.util.Scanner;
class Stringlength{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    int c=0;
    for(int i=0;i<n.length();i++){
      c++;
    }
    System.out.println("The length of your string :" + c);
    
  }
}