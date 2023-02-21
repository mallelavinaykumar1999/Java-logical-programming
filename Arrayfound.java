import java.util.*;
class Arrayfound
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
      System.out.println("enter your search value : ");
       int ser=sc.nextInt();
      
      int i;
  
        for( i=0;i<n;i++)
          {      
              if(ser==a[i])
               {
                    System.out.println(ser+" is Found");
                    break;
                 
               }
           }
          if(i==n)
                {
                  System.out.println(ser+" is Not Found");
      }
      
    }
  }