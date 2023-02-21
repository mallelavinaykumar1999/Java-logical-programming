import java.util.*;
class Arraydel
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your array size :");
      n=sc.nextInt();
      
      int a[]=new int[n];
      System.out.println("enter your values in array :");
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
       System.out.println("enter your postion to delete");
       int m=sc.nextInt();
       System.out.println("your elements in array :");
      for(int i=0;i<a.length;i++){
          if(m==i){
              continue;
          }
          else
          System.out.print("\t"+a[i]);
      }
      
    }
  }