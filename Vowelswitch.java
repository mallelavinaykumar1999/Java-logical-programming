import java.util.*;
class Vowelswitch{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  your char:");
    ch=sc.next().charAt(0);
    if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z'){
    switch(ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      System.out.println("its vowel");
         break;
      default:
      System.out.println("its consonent");
    }
    }
    else{
      System.out.println("invalid input");
    }
  }
}