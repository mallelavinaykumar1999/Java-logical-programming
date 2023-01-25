import java.util.*;
class Emp{
  int eno;
  String ename;
  Float esal;
  Scanner sc=new Scanner(System.in);
  void emp(){
    System.out.println("enter employee number");
     eno=sc.nextInt();
    System.out.println("enter employee name");
     ename=sc.next();
    System.out.println("enter employee salary");
     esal=sc.nextFloat();
    System.out.println("your employee number is "+ eno);
    System.out.println("your employee name is "+ ename);
    System.out.println("your employee salary is "+esal);
  }
}


class empmethod{
  public static void main(String args[]){
    Emp e1=new Emp();
    e1.emp();
    
  }
}