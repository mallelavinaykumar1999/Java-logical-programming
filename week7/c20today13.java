/*Java program that uses a loop to find the most common letter in a string 
  String str = "This is a sample sentence";*/
import java.util.*;
class c20today13{
  public static void main(String args[]){
    String s1;
    
    char ch;
    char tch='a';
    int max=0,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your string");
    s1=sc.nextLine();
    String s2=s1.toLowerCase();
    for(ch='a';ch<='z';ch++){//a b c d e
      count=0;
      for(int i=0;i<s2.length();i++){//0
        if(ch==s2.charAt(i)){//a==a
          count++;//3
          if(count!=0){//3!=0
      if(count>max){//3>1 
        max=count;//3
        tch=ch;//e
      }
    }
        }
      }
      
    }
    System.out.println("the most common letter in given string is "+tch);
    
  }
}