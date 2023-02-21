import java.util.*;
class Arraysum
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your array size :");
      n=sc.nextInt();
      
      int a[]=new int[n];
      System.out.println("enter your values in array :");
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
       
      for(int i=0;i<a.length;i++){
      sum+=a[i];
      }
      System.out.println("The sum of your array  is :"+sum);
    }
  }