import java.util.*;
class Rev{
  public static void main(String args[]){
    int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int rem;
    int rev=0;
    while(n>0)
      {
       rem=n%10;
       rev=rem+rev*10;
       
       n=n/10;
       
      }
      System.out.println(rev);
      
  }
}