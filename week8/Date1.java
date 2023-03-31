import java.util.*;
class Main{
    public static void main(String args[]){
        Date d=new Date();
        System.out.println("the date is "+d);
        System.out.println("the date is "+(d.getDate()));
        System.out.println("the month is "+(d.getMonth()+1));
        System.out.println("the year is "+(d.getYear()+1900));
        System.out.println("the day is "+d.getDay());
        System.out.println("the hour is "+d.getHours());
        System.out.println("the Mins is "+d.getMinutes());
        System.out.println("the secs is "+d.getSeconds());
        
        
    }
}