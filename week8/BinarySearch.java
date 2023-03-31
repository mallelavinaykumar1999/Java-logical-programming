/******************************************************************************
write a program to search the elemnt using binary search bu using methods

*******************************************************************************/
import java.util.*;
class Linear{
    int i;
    Scanner sc=new Scanner(System.in);
    void getArray(int a[],int n){
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }
    void display(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }
    }
    void Search(int beg,int end,int mid,int a[],int n,int ser){
       while(beg<=end){
           if(a[mid]<ser){
               beg=mid+1;
           }
           else if(a[mid]==ser){
               System.out.println(" your element found at position "+(mid+1));
               break;
           }
           else{
               end=mid-1;
           }
           mid=(beg+end)/2;
       }
       if(beg>=end){
           System.out.println(" the element not found");
       }
}
}
public class BinarySearch
{
	public static void main(String[] args) {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your size :");
	 n=sc.nextInt();
	int a[]=new int[n];
	Linear l1=new Linear();
	System.out.println("enter elements in array ");
	l1.getArray(a,n);
	System.out.println("display array elements in array");
	l1.display(a,n);
	System.out.println("\nenter your elemt to serch");
	int ser=sc.nextInt();
	int beg=0;
	int end=a.length-1;
	int mid=(beg+end)/2;
	l1.Search(beg,end,mid,a,n,ser);
	
	
	}
}