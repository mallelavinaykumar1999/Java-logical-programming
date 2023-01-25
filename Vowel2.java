/*
    Write a Java Program to check given character is Vowel or Consonent using else if ladder?
​[15:28] Karunakar Eeede
    check Small letter and Capital letter in one condition*/
import java.util.*;
class Vowel2{
  public static void main(String args[]){
    char c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter char:");
    c=sc.next().charAt(0);
    
    if(c=='a'|| c=='A')
      System.out.println(c+" its vowel");
    else if(c=='e'|| c=='E')
      System.out.println(c+" its vowel");
    else if(c=='i'|| c=='I')
      System.out.println(c+" its vowel");
    else if(c=='o'|| c=='O')
      System.out.println(c+" its vowel");
    else if(c=='u'|| c=='U')
      System.out.println(c+" its vowel");
   
    else 
      System.out.println("its consonent");
  }
}
