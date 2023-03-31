import java.util.*;
public class Main
{
 public static void main(String args[])
 {
     Calendar cal=Calendar.getInstance();
     Scanner sc=new Scanner(System.in);
     
     //cal.set(2023,03,01); 
     //setting new date
    
     System.out.println("enter your dob year ");
     int dob=sc.nextInt();
     int count=0;
     while(dob<cal.get(Calendar.YEAR)){
         count++;
         dob++;
     }
     System.out.println("age is "+count) ;
     
 }
}