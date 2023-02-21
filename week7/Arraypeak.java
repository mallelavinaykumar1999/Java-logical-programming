/******************************************************************************
Find a peak element which is not smaller than its neighbours.

*******************************************************************************/
import java.util.*;
public class Arraypeak
{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter your elements in array :");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		if(n==1){
		    System.out.println("the pick element in array is :"+a[0]);
		}
		if(n>1){
		if(a[0]>=a[1]){
		    System.out.println("the pick element in array is :"+a[0]);
		}
		if(a[n-1]>=a[n-2]){
		    System.out.println("the pick element in array is :"+a[n-1]);
		}
		for(int i=1;i<n-1;i++){
		    if(a[i]>=a[i-1] && a[i]>=a[i+1]){
		        System.out.println("the pick element in array is :"+a[i]);
		    }
		}
		}
	}
}