/******************************************************************************
wrie a Java program to print the array  by taking values from the user and  Passing Array as a Method Arguments

*******************************************************************************/
import java.util.*;
class MethodArray2
{
  int i;
 void arrayMethod(int x[])
 {
   for(i=0;i<x.length;i++){
     System.out.print(" "+x[i]);
   }
 }
}
class Arraymethod1
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
MethodArray2 ma1=new MethodArray2();
 ma1.arrayMethod(a);
 }
}