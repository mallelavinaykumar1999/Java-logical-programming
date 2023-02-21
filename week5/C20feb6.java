/*
    *
   * *
 *   *
*      *
*       *
*     *
  *   *
   * *
    *
*/
import java.util.*;
public class C20feb6 {
	public static void main(String[] args) {
		int i, j, k,n=5;
		
		
		for (i = 1 ; i <= n; i++ ) 
		{
			for (j = 1 ; j <= n - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (i = n - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= n - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}