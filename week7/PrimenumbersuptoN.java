import java.util.*;
public class PrimenumbersuptoN
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
   
		System.out.println("enter your num :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
		    int n=i;
		   int c=0;
		    for( int j=1;j<=n;j++){
		        if(n%j==0){   
		            c+=1;
		        }   
		    }
      
		    if(c==2){
		        System.out.println("your prime number is :"+i);
		    }
		}
	}
}