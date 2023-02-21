/*{2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6} */
/******************************************************************************
wrie a Java program to remove dublicate in array   by  taking values from the user

*******************************************************************************/
import java.util.*;
public class Removedub {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your array size");
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter your values :");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    int j = 0;//
    for (int i = 0; i < n; i++) {
    
               
      if (arr[i] != arr[j]) {
                              
        arr[++j] = arr[i];
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}