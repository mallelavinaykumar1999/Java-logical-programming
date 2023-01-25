import java.util.*;
class rectangle{
  void area(int x,int y){
    int area,perimeter;
    area=x*y;
    perimeter=2*(x+y);
    System.out.println(" the area of rectangle is " +area);
    System.out.println(" the perimeter of rectangle is " +perimeter);
    
  }
  
}
class Rectanglemethod{
  public static void main(String args[]){
    int l,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length and breadth :");
    l=sc.nextInt();
    b=sc.nextInt();

  rectangle r1=new rectangle();
    r1.area(l,b);

  }
}