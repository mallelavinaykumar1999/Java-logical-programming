/******************************************************************************

 55. Write a JAVAprogram to copy all elements from an array to another array.

*******************************************************************************/
import java.util.*;
public class copiedelementsinarray
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your array size : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter your elements in array");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	int arr[]=new int[a.length];
	for(int i=0;i<a.length;i++){
	    arr[i]=a[i];
	}
	System.out.println("your copied elements in array is ");
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+" ");
	}
	
	
	}
}
