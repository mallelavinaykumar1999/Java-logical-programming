/******************************************************************************
wrie a Java program to find the reverse of each word   in string 

*******************************************************************************/
import java.util.Scanner;
class Wordsreverse{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n1=sc.nextLine();
    String n=n1.toLowerCase();
    String words[] = n.split(" ");
    String word="";
    
    
    for(int i=0;i<words.length;i++){
      word=words[i];
      String reverse="";
      for(int j=word.length()-1;j>=0;j--){
        reverse+=word.charAt(j);
         
      }
     System.out.print("\t"+reverse);
    }
    
 }
 }