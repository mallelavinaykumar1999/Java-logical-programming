/******************************************************************************
Write a JAVAprogram to count total number of duplicate elements in an array.
*******************************************************************************/
import java.util.*;
public class Dublicatecount
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
		LinkedHashSet <Integer> hset=new  LinkedHashSet<Integer>();
		int dubcount=0;
	    for(int i=0;i<n;i++){
	        hset.add(a[i]);
	    }
	    int count=0;
	    for(int j:hset){
	        count=0;
	    for(int i=0;i<n;i++){
	        if(j==a[i]){
	            count++;
	        }
	    }
	    if(count>1){
	        dubcount++;
	    }
	    }
	    if(dubcount!=0)
	    System.out.println("your dublicate elemnts count in array is : "+dubcount);
		
	}
}
