/******************************************************************************
Write a JAVAprogram to find all factors of a number.
*******************************************************************************/
import java.util.*;
public class Factorsofnum {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your num");
       int num=sc.nextInt();
       System.out.println("the factors are");
       for(int i=1;i<=num;i++){
           if(num%i==0){
               System.out.println(i);
           }
       }
    }
}