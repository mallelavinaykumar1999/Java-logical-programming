/******************************************************************************
wrie a Java program to sort the array  by taking values from the user by using bubble sort

*******************************************************************************/
import java.util.*;
class Bubblesort{
  public static void main(String args[]){
    int n,i,j,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your array size :");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter your values in array :");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("your array before sorting:");
    for(i=0;i<n;i++){
      System.out.print(" "+ a[i]);
    }
    for(i=0;i<n-1;i++){
      for(j=0;j<n-1-i;j++){
             if(a[j]>a[j+1]){
               t=a[j];
               a[j]=a[j+1];
               a[j+1]=t;
             }   
      }
    }
    System.out.println("\nyour array vales after sorting:");
    for(i=0;i<n;i++){
       System.out.print(" "+ a[i]);
    }
  }
}