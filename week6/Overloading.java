import java.util.*;
class Overload{
  void overLoad(int n){
    int fact=1;
    for(int i=n;i>=1;i--){
      fact=fact*i;
    }
    System.out.println(" your factorial is "+fact);
  }
  void overLoad(int n,int m){
    int sum=0;
    sum=n+m;
    System.out.println("sum of two numbers is "+sum);
  }
}

class Overloading{
  public static void main(String args[]){
    int n,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    System.out.println("enter another number :");
    m=sc.nextInt();
    Overload a=new Overload();
    a.overLoad(n);
    a.overLoad(n,m);
  }
}