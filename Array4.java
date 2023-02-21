import java.util.*;
class Array4{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your array size :");
    int n=sc.nextInt();
    int arr1[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("enter your value");
      arr1[i]=sc.nextInt();
      
    }
    for (int a: arr1){
      System.out.println("your value is "+a);
    }
    
  }
}