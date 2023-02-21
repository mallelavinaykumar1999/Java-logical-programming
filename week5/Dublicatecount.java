
/******************************************************************************
wrie a Java program to Find the frequencies of all duplicates elements in the array Input: arr[] = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6} 
Output: Below is the frequency of repeated elements – 
4 –> 4 
5 –> 2 
6 –> 3
Input: arr[] = {4, 4, 5, 5, 6} 
Output: Below is the frequency of repeated elements – 
4 –> 2 
5 –> 2

*******************************************************************************/

import java.util.*;

public class Dublicatecount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your array size");
    int n = sc.nextInt();
    int[] arr = new int[n];

    int[] a = new int[n];
    System.out.println("enter your values :");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      a[i] = arr[i];
    }

    int j = 0;//

    for (int i = 0; i < n; i++) {//0<10

      if (arr[i] != arr[j]) {//

        arr[++j] = arr[i];

      }
    }
    for (int i = 0; i <= j; i++) {// 0<=2
     
      int c = 0;
      for (int m = 0; m < n; m++) {// 0<6
        if (arr[i] == a[m]) {//
          c++;
        }
      }
      if (c > 1) {
        System.out.println(" count of " + arr[i] + " is " + c);
      }
    }
  }
}