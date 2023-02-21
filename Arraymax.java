import java.util.*;
class Arraymax
  {
    public static void main(String args[])
    {
      int n,max=0;
      int min=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your array size :");
      n=sc.nextInt();
      
      int a[]=new int[n];
      System.out.println("enter your values in array :");
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
       min=a[0];
      for(int i=0;i<a.length;i++){
      if(max<a[i]){
        max=a[i];
      }
        
        if(min>a[i]){
          min=a[i];
        }
      }
      System.out.println("The maximum value  of your array  is : "+max);
      System.out.println("The minimum value of your array  is : "+min);
    }
  }