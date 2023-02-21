/******************************************************************************
Given an array of N integers, and a number sum, the task is to find the number of 
pairs of integers in the array whose sum is equal to sum.

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).


*******************************************************************************/
import java.util.*;

class array{
    Scanner sc=new Scanner(System.in);
    void getArray(int a[],int n){
        for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
    }
    void sumOFpair(int a[],int n){// 1 5 7 -1   sum=6
    for(int i=0;i<a.length;i++){//0<4 1<4 2<4 3<4
        for(int j=i+1;j<a.length;j++){//4<4
            if(a[i]+a[j]==n){//7-1==6
                System.out.println("the pair is "+a[i]+" , "+a[j]);
            }
        }
    }
     
    }
    }






public class Sumofpairs
{
	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter your sum :");
		int sum=sc.nextInt();
		
	    array s1=new array();
	    System.out.println("enter your elements in 1st array :");
	    s1.getArray(a,n);
	     
	    System.out.println("elements in array after union :");
		s1.sumOFpair(a,sum);
		
		
	}
}