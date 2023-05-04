/******************************************************************************
Write a JAVAprogram to count frequency of each element in an array.
*******************************************************************************/
import java.util.*;
public class frequency
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
	    if(count!=0){
	        System.out.println(j+" : "+count);
	    }
	    }
		
	}
}
