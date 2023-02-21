 /******************************************************************************
wrie a Java program to print the array  by taking values from the user and  Passing Array as a Method Arguments and retuen to main method

*******************************************************************************/
import java.util.*;
class MethodArray3
{
  int i;
  
 int[] arrayMethod(int x[])
 { 
   return x;
 }
}
class Arraymethod2
{
 public static void main(String args[])
 {
 int n,i; 
 Scanner sc=new Scanner(System.in);
   System.out.println("enter your array size :");
   n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("enter your values :");
   for(i=0;i<n;i++){
     a[i]=sc.nextInt();
   }
MethodArray3 ma1=new MethodArray3();
 int v[]=ma1.arrayMethod(a);
   System.out.println(" the values in array is :");
   for(i=0;i<a.length;i++){
     System.out.print(" "+v[i]);
   }
 }
}