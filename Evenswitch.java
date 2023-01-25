import java.util.*;
class Evenswitch{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  your num:");
    num=sc.nextInt();
   
    switch(num%2){
      case (0):
        System.out.println("its even");
        break;
      case 1:
        System.out.println("its odd");
        break;
      default:
      System.out.println("invalid input");
    }
    
    
  }
}