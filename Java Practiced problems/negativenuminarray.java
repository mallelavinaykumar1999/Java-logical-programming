/******************************************************************************
Write a JAVAprogram to print all negative elements in an array.
*******************************************************************************/
import java.util.*;
public class negativenuminarray
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n[]={-1,5,4,-20,6,-25};
	for(int i=0;i<n.length;i++){
	    if(n[i]<0){
	        System.out.print(n[i]+" ");
	    }
	}
	}
}
