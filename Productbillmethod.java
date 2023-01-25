/*Write a Program to Enter Product Number, Product Name, Product Cost, Product Quantity, calculate Bill Amout and print the report?*/
import java.util.*;

class Product{
  int product_num,product_qty;
    String product_name;
    Float product_cost,bill_amt;
    Scanner sc=new Scanner(System.in);
  void bill(){
    System.out.println("enter product number :");
    product_num=sc.nextInt();
    System.out.println("enter product name :");
    product_name=sc.next();
    System.out.println("enter product cost :");
    product_cost=sc.nextFloat();
    System.out.println("enter product quantity :");
    product_qty=sc.nextInt();

    bill_amt=product_cost*product_qty;
    System.out.println("your product number is "+ product_num);
    System.out.println("your product name is " + product_name);
    System.out.println("your product cost is " + product_cost);
    System.out.println("your product quantity is "+ product_qty);
    System.out.println("your bill amount  of "+ product_cost +" * " +product_qty+ " is "+bill_amt);
  }
}



class Productbillmethod{
  public static void main(String args[]){
    Product p1=new Product();
    p1.bill();
  }
}