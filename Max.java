import java.util.*;
class Max{
  public static void main(String args[]){
    int a,b,c,max;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c  values:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    max=0;
  if(a>max){
    max=a;
  }
  if(max<b){
    max=b;
  }
  if(max<c){
    max=c;
  }
    System.out.println("the maximum of three numbers is "+max);
    
    
  }
}