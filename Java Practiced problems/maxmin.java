/******************************************************************************
Write a JAVAprogram to find maximum and minimum element in an array.
*******************************************************************************/
import java.util.*;
public class maxmin
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]={-1,5,4,-20,6,-25};
	for(int i=0;i<a.length-1;i++){
	    for(int j=0;j<a.length-i-1;j++){
	        if(a[j]>a[j+1]){
	            int t=a[j];
	            a[j]=a[j+1];
	            a[j+1]=t;
	        }
	    }
	   
	}
	 System.out.println("maximum element is : "+ a[a.length-1]);
	 System.out.println("minimum element is : "+a[0]);
	}
}
