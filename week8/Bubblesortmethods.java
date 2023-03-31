/******************************************************************************
write a program to sort the elements by using bubble sort by using methods

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
    void Bubble(int a[],int n){
       for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-1-i;j++){
               if(a[j]>a[j+1]){
                   t=a[j];
                   a[j]=a[j+1];
                   a[j+1]=t;
               }
           }
       }
}
}
public class Main
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
	l1.Bubble(a,n);
   System.out.println("\ndisplay array elements in array after sorting");
		l1.displayArray(a,n);
	
	}
}
