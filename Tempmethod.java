/*Create a program that converts Fahrenheit to Celsius using the formula (C = (F - 32) * 5/9).*/
import java.util.*;
class Temp{
  double c,f;
    Scanner sc=new Scanner(System.in);
  void temp1(){
    System.out.println("enter your temperature in fahrenheit:");
    f=sc.nextDouble();
    c=((double)(f-32)*5/9);
    System.out.println(" tour temparature in celsius is :"+c);
  }
}


class Tempmethod{
  public static void main(String args[]){
    Temp t1=new Temp();
    t1.temp1();
    
  }
}