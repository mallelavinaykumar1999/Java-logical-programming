import java.util.*;
public class StronguptoN
{
	public static void main(String[] args) {
	    int rem,fact=1,sum=0;
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your num ");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++){
		int temp=j;
		int i=j;
		while(i>0){
		    rem=i%10;
		    while(rem>0){
		        fact*=rem;
		        rem--;
		    }
		    sum+=fact;
		    fact=1;
		    i=i/10;
		    
		}
		if(temp==sum)
		System.out.println(sum);
		sum=0;
		}
		
	}
}