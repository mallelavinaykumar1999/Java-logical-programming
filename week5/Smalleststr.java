/******************************************************************************
write a Program to find the largest and smallest word in a string

*******************************************************************************/

import java.util.Scanner;
class Smalleststr{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n1=sc.nextLine();
    String n=n1.toLowerCase();
    String words[] = n.split(" ");
    String large=words[0];
    String small=words[0];
    
    for(int i=1;i<words.length;i++){
      
      if(words[i].length()>large.length())
      {
        large=words[i];
        }
      if(words[i].length()<small.length())
      {
        small=words[i];
      }
    
       }
System.out.println("The Largest string in given string is: "+large);
System.out.println("The Smallest string in given string is: "+small);
 }
 }
      