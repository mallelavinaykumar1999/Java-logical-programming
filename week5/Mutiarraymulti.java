/******************************************************************************
wrie a Java program to multiply multidimensional array   taking values from the user

*******************************************************************************/
import java.util.*;
class Mutiarraymulti{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your row size:");
    int r1=sc.nextInt();
     System.out.println("enter your col size:");
    int c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    int b[][]=new int[r1][c1];
    int c[][]=new int[r1][c1];
    
      System.out.println("enter your vales in first matrix :");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        a[i][j]=sc.nextInt();
        
      }
      
    }
    System.out.println("enter your vales in second matrix :");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        b[i][j]=sc.nextInt();
        
      }
      
    }
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        c[i][j]=0;
        for(int k=0;k<r1;k++){
          c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
      }
    }
    System.out.println("your vales in matrix after multiplication :");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        System.out.print(" "+c[i][j]);
        
      }
      System.out.println();
      
    }
  }
}