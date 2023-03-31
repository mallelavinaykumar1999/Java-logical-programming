/******************************************************************************
write a program to search the elemnt using linear search bu using methods

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
    Boolean Search(int a[],int n,int ser){
        boolean b=true;
        for(int i=0;i<n;i++){
        if(ser==a[i]){
            b=true;
            break;
        }
    }
    if(i==n){
        b=false;
    }
    return b;
}
}
public class searching1
{
	public static void main(String[] args) {
	int n,i;
	Boolean out;
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
	out=l1.Search(a,n,ser);
	System.out.println("your elemnt is found : "+out);
	
	
	}
}
