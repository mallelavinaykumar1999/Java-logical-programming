import java.util.*;
class Threenumbers{
  public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    if(a>b ){
      if(a>c){
        System.out.println(a+" is big number");
      }
      else{
        System.out.println(c+" is big number");
      }
    }
      
    else{
      if(b>c){
        System.out.println(b+" is big number");
      }
      else{
        System.out.println(c+" is big number");
      }
    }
      
  }
}