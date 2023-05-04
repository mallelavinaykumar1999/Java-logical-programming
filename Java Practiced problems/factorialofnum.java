/******************************************************************************
Write a JAVAprogram to calculate factorial of a number.
*******************************************************************************/
import java.util.*;
public class factorialofnum {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your num");
       int num=sc.nextInt();
       int fact=1;
       for(int i=num;i>0;i--){
           fact*=i;
       }
       System.out.println(num +"!"+" : "+fact);
    }
}