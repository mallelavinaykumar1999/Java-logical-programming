/******************************************************************************
Write a JAVAprogram to delete an element from an array at specified position.

*******************************************************************************/
import java.util.*;
public class Deleteelementinarry
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter your array elemnts");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("enter specified index position to delete");
		int index=sc.nextInt();
		if(index<0 || index>=n){
		    System.out.println("invalid index to delete");
		}
		else{
		    for(int j=index;j<n-1;j++){
		        a[j]=a[j+1];
		    }
		    n--;
		    	int arr1[]=new int[n];
		    	for(int i=0;i<n;i++){
		    	    arr1[i]=a[i];
		    	}
		    	for(int i=0;i<n;i++){
		    System.out.print(arr1[i]+" ");
		}
		}
		
	}
}
