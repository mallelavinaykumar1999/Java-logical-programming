import java.util.*;
class Variables{
  public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a==b && a==c)
      System.out.println("all variables are equal");
    else
      System.out.println("all variables are not  equal");
  }
}