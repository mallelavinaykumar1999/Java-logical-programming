import java.util.*;
class Palindrome{
  public static void main(String args[]){
    int  n;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n;
    int rem;
    int rev=0;
    while(n>0)
      {
       rem=n%10;
       rev=rem+rev*10;
       
       n=n/10;
       
      }
      
      if(temp==rev)
      System.out.println("its palindrome");
      else 
      System.out.println("its not  palindrome");
  }
}