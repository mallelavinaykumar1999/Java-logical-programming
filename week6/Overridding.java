import java.util.*;
class Overload{
  void overRide(int n,int m){
    int diff=0;
    diff=n-m;
    System.out.println(" your difference of two numbers is "+diff);
  }
}
class Override extends Overload{
  void overRide(int n,int m){
    int sum=0;
    sum=n+m;
    System.out.println("sum of two numbers is "+sum);
  }
}

class Overridding{
  public static void main(String args[]){
    int n,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    System.out.println("enter another number :");
    m=sc.nextInt();
    Overload a=new Overload();
    Override b=new Override();
    Overload o;
    o=a;
    o.overRide(n,m);
    o=b;
    o.overRide(n,m);
  }
}