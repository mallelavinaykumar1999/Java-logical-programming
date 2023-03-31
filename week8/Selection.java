/******************************************************************************
write a program to sort the elements by using selection sort by using methods

*******************************************************************************/
import java.util.*;
class Linear{
    int i,t;
    Scanner sc=new Scanner(System.in);
    void readArray(int a[],int n){
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }
    void displayArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }
    }
    void Selection(int a[],int n){
       for(int i=0;i<a.length-1;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]>a[j]){
                   t=a[j];
                   a[j]=a[i];
                   a[i]=t;
               }
           }
       }
}
}
public class Selection
{
	public static void main(String[] args) {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your size :");
	 n=sc.nextInt();
	int a[]=new int[n];
	Linear l1=new Linear();
	System.out.println("enter elements in array ");
	l1.readArray(a,n);
	System.out.println("display array elements in array before sorting");
	l1.displayArray(a,n);
	l1.Selection(a,n);
   System.out.println("\ndisplay array elements in array after sorting");
		l1.displayArray(a,n);
	
	}
}
