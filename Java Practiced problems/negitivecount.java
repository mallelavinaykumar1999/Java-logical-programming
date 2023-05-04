/******************************************************************************
Write a JAVAprogram to count total number of negative elements in an array.
*******************************************************************************/
import java.util.*;
public class negitivecount
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]={1,-2,-3,4,-5,6,7};
	int negcount=0;
	for(int i=0;i<a.length;i++){
	    if(a[i]<0){
	        negcount++;
	    }
	    
	}
	System.out.println("the negative count in array is "+negcount);
	}
}
