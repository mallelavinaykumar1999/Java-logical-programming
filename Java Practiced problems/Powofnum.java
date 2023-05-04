/******************************************************************************
Write a JAVAprogram to find power of a number using for loop.
*******************************************************************************/
import java.util.*;
public class Powofnum {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your num");
       int num=sc.nextInt();
       System.out.println("enter your exponent");
       int exp=sc.nextInt();
       
       int power=1;
       for(int i=1;i<=exp;i++){
           power*=num;
       }
       System.out.println("power of num is "+power);
    }
}