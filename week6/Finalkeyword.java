import java.util.*;
class Overload{
  void overRide(int n,int m){
    int diff=0;
    diff=n-m;
    System.out.println(" your difference of two numbers is "+diff);
  }
}
final class Override extends Overload{
  int sum=0;
  final void overRide(int n,int m){
    super.overRide( n,  m);
    
    sum=n+m;
    
    System.out.println("sum of two numbers is "+sum);
  }
}

class Finalkeyword{
  public static void main(String args[]){
    int n,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    System.out.println("enter another number :");
    m=sc.nextInt();
    Override a=new Override();
    a.overRide(n, m);
  }
}