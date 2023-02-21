/******************************************************************************
Java program that uses a loop to find the longest palindromic substring in a string:

*******************************************************************************/
import java.util.Scanner;
class LargestpalindromeStr{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n1=sc.nextLine();
    String n=n1.toLowerCase();
    String words[] = n.split(" ");
    String word="";
    String large=words[0];
    
    for(int i=0;i<words.length;i++){
      word=words[i];
      String reverse="";
      for(int j=word.length()-1;j>=0;j--){
        reverse+=word.charAt(j);
         
      }
     if(word.equals(reverse)){
       if(word.length()>large.length()){
         large=word;
       }
     }
    }
    System.out.println("your largest palindrome string is "+large);
    
 }
 }