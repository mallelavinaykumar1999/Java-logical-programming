/*Write a program that takes the day of the week and the current time as input and prints out whether or not the library is open using nested if*/
import java.util.*;
class Library{
  public static void main(String args[]){
    String  day;
    double time;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter day of the week:");
    day=sc.next();
    System.out.println("enter time(24 hours format) :");
    time=sc.nextDouble();
    if(day.equals("monday") ||day.equals("tuesday")||day.equals("wednesday") ||day.equals("thursay")||day.equals("friday")){
      if(time>=7.00 && time<=19.00){
        System.out.println("Library is open");
      }
      else{
        System.out.println("Library is Closed ");
      }
    }
    else{
      System.out.println("Its holiday");
    }
    
  }
}