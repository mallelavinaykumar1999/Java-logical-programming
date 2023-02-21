/******************************************************************************
Find Subarray with given sum | Set 1 (Non-negative Numbers)

*******************************************************************************/
import java.util.*;

class Subarray{
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int sumOFsubarray(int a[]){
        System.out.println("enter your starting value:");
        int i=sc.nextInt();
        System.out.println("enter your ending value:");
        int j=sc.nextInt();
        for(int m=i;m<=j;m++){
            if(a[m]>0){
                sum=sum+a[m];
            }
        }
        return sum;
    }
}





public class Main
{
	public static void main(String[] args) {
		int n;
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size :");
		n=sc.nextInt();
    System.out.println("enter your array size :");
		m=sc.nextInt();
		int a[]=new int[n];
    
		System.out.println("enter your elements in array :");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
	    Subarray s1=new Subarray();
		sum=s1.sumOFsubarray(a);
		System.out.println("the sum of subarray is :"+sum);
		
	}
}