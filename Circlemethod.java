/* Create a program that calculates the area of a circle using the formula (pi * radius^2).
 
Declare a constant double variable for pi with the value of 3.14.
Ask the user to input the radius of the circle.
Declare a double variable to store the radius value.
Use the variable and the constant to calculate the area of the circle and store the result in a double variable.
Print the result.*/
import java.util.*;
class circle{
  double area;
  void radius(double r)
  {
    area=3.14*r*r;
    System.out.println("the area of circle is "+ area);
  }
}
class Circlemethod{
  public static void main(String args[]){
    double a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your radius :");
    a=sc.nextDouble();
    circle c1=new circle();
    c1.radius(a);
    
}
}