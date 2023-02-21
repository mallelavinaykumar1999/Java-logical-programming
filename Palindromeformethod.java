import java.util.*;
class palin{
  int Palindrome(int n){
    int rem;
    int rev=0;
    for(;n>0;)
      {
       rem=n%10;
       rev=rem+rev*10;
       
       n=n/10;
       
      }
    return rev;
  }
}





class Palindromeformethod{
  public static void main(String args[]){
    int  n;
    int rev;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n;
    palin p1=new palin();
    rev=p1.Palindrome(n);
    
      
      if(temp==rev)
      System.out.println("its palindrome");
      else 
      System.out.println("its not  palindrome");
  }
}