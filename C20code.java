import java.util.*;
class C20code{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your num :");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      int j=i;
      int rem;
      int power=0;
      int sum=0;
      String s=""+i;
      while(j>0){
        rem=j%10;
        power=(int)Math.pow(rem,s.length());
        sum+=power;
        j=j/10;
      
        //System.out.println(sum);
      }
      if(sum==i){
        System.out.println("your armstrong num is :"+sum);
      }
      
      }
    }
  }
