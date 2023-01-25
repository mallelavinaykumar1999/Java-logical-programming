/*
    input --->  month value ---->2
 
   output----> Month Name: Feb*/
import java.util.*;
class Month{
  public static void main(String args[]){
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  month num:");
    a=sc.nextInt();
    
    if(a==1)
      System.out.println("Month Name: Jan");
    else if(a==2)
      System.out.println("Month Name: Feb");
    else if(a==3)
      System.out.println("Month Name: Mar");
    else if(a==4)
      System.out.println("Month Name: Apr");
    else if(a==5)
      System.out.println("Month Name: May");
    else if(a==6)
      System.out.println("Month Name: Jun");
    else if(a==7)
      System.out.println("Month Name: Jul");
    else if(a==8)
      System.out.println("Month Name: Aug");
    else if(a==9)
      System.out.println("Month Name: Sep");
    else if(a==10)
      System.out.println("Month Name: Oct");
    else if(a==11)
      System.out.println("Month Name: Nov");
    else if(a==12)
      System.out.println("Month Name: Dec");
    else
      System.out.println("invalid input provide between 1 to 12");
  }
}