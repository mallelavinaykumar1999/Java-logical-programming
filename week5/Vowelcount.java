/******************************************************************************
wrie a Java program to find the vowel count   of string 

*******************************************************************************/
import java.util.Scanner;
class Vowelcount{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n1=sc.nextLine();
    int c=0;
    String n=n1.toLowerCase();
    for(int i=0;i<n.length();i++){
        if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
      c++;
    }
    System.out.println("The vowel count in your string :" + c);
    
  }
}