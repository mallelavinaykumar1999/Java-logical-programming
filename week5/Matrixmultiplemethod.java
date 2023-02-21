/******************************************************************************
wrie a Java program to multiply the  two multidimensional array  by taking values from the user and  Passing Array as a Method Arguments

*******************************************************************************/
import java.util.*;
class ArrayDemo2 {
  Scanner sc = new Scanner(System.in);
  int i, j;
 /*void getMatrix(int x[][], int r, int c)
  {
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              x[i][j]=sc.nextInt();
          }
      }
  }*/
 /* void dispMatrix(int x[][], int r, int c) {
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              System.out.print(" " +x[i][j]);
          }
          System.out.println();
      }
  }*/
  void matMulti(int a[][], int b[][], int c[][], int r1, int c1) {
      for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        c[i][j]=0;
        for(int k=0;k<r1;k++){
          c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
      }
    }
  }
}
class Matrixmultiplemethod {
  public static void main(String args[]) {
    ArrayDemo1 ad1 = new ArrayDemo1();
    ArrayDemo2 ad2= new ArrayDemo2();
    Scanner sc = new Scanner(System.in);
    int r1, c1, i, j;
    System.out.println("Enter Row Size:");
    r1 = sc.nextInt();
    System.out.println("Enter Col Size:");
    c1 = sc.nextInt();
    int a[][] = new int[r1][c1];
    int b[][] = new int[r1][c1];
    int c[][] = new int[r1][c1];
    System.out.println("Enter Elements to 1st Matrix:");
    ad1.getMatrix(a,r1,c1);
 System.out.println("Enter Elements to 2nd Matrix:");
 ad1.getMatrix(b,r1,c1);
 System.out.println("The Elements in 1st matrix is:");
 ad1.dispMatrix(a,r1,c1);
 System.out.println("The Elements in 2nd matrix is:");
 ad1.dispMatrix(b,r1,c1);
 System.out.println("The Addition of Two Matricies is:");
 ad2.matMulti(a,b,c,r1,c1);
System.out.println("addition of two matrices  is:");
    ad1.dispMatrix(c,r1,c1);
 }
}