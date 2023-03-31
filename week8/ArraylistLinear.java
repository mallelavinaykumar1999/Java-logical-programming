/******************************************************************************
write a program to find the element by using Linear search by using methods in ArrayList


*******************************************************************************/
import java.util.*;
class Linear{
    int i,t;
    Scanner sc=new Scanner(System.in);
    void readArrayList(ArrayList<Integer> al,int n){
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
    }
    void displayArray(ArrayList<Integer> al,int n){
        for(int i=0;i<n;i++){
            System.out.print("\t"+al.get(i));
        }
    }
    void LinearSearch(ArrayList<Integer> al,int n,int ser){// 88 11 02 66 99
    int c=0;
       for(int i:al){
           if(i==ser){
               System.out.println("the elemnt found");
               c=1;
               break;
           }
       }
       if(c==0){
           System.out.println("the elent not found");
       }
       
}
}
public class ArraylistLinear
{
	public static void main(String[] args) {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your size :");
	 n=sc.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();
	Linear l1=new Linear();
	System.out.println("enter elements in array ");
	l1.readArrayList(al,n);
	System.out.println("display array elements in array before sorting");
	l1.displayArray(al,n);
	System.out.println("\nenter your searching element");
	int ser=sc.nextInt();
	l1.LinearSearch(al,n,ser);
   
	
	}
}