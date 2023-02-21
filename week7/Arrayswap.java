public class Arrayswap
{
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]=new int[4];
	
		for(int i=0;i<arr1.length;i++){
		    if(i<2){
		       arr2[i]=arr1[i]; 
		    }
		    else if (i>=3)
		    arr2[i-1]=arr1[i];
		    else
		    continue;
		}
		for(int a:arr2){
		    System.out.println(a);
		}
		
		
		
	}
}