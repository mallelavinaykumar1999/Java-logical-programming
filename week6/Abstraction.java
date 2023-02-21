import java.util.*;
abstract class abst1{
  abstract void calculate(int n);
}
class calculate1 extends abst1{
  void calculate(int n){
    int fact=1;
    for(int i=n;i>=1;i--){
      fact=fact*i;
    }
    System.out.println(" your factorial is "+fact);
  }
}
class calculate2 extends abst1{
  void calculate(int n){
    int power=0;
   power=(int)Math.pow(n,2);
    System.out.println("the power of number is "+power);
  }
}
class calculate3 extends abst1{
  void calculate(int n){
    int sroot=0;
   sroot=(int)Math.sqrt(n);
    System.out.println("square root of number is "+sroot);
  }
}


class Abstraction{
  public static void main(String args[]){
    int n,m,v;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number for factorial :");
    n=sc.nextInt();
     System.out.println("enter your number for power :");
    m=sc.nextInt();
     System.out.println("enter your number for squarerrot :");
    v=sc.nextInt();
    
    calculate1 c1=new calculate1();
    calculate2 c2=new calculate2();
    calculate3 c3=new calculate3();
    c1.calculate(n);
    c2.calculate(m);
    c3.calculate(v);
    
  }
}