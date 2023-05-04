/******************************************************************************
Write a JAVAprogram to find frequency of each digit in a given integer.

*******************************************************************************/
import java.util.*;
public class frequencyofnum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter your num");
		long num=sc.nextLong();
		for(int i=0;i<=9;i++){
		    int count=0;
		    long temp=num;
		    long rem;
		    while(temp>0){
		        rem=temp%10;
		        if(rem==i){
		            count++;
		        }
		        temp=temp/10;
		    }
		    if(count!=0)
		    System.out.println(i +" : "+count);
		}
	}
}
