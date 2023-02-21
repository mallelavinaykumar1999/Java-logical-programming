import java.util.*;
class userData{
  int n,temp;
  void Data(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your n value :");
  n=sc.nextInt();
  temp=n;
}
}
class Facorial extends userData{
  int fact=1;
  
  
  void Fact(){
    while(n>0){
      fact=fact*n;
      n--;
      
    }
    System.out.println("the factorial of "+temp+" is "+fact);
  }
}
class sumOfnatural extends userData{
  int sum=0;
  void sum(){
  for(int i=0;i<=n;i++){
  sum=sum+i;
  }
System.out.println("the sum of natural num "+ n+" is "+sum);
}
}


class Hierarchial{
  public static void main(String args[]){
    Facorial f1=new Facorial();
    sumOfnatural s1=new sumOfnatural();
    f1.Data();
    f1.Fact();
    s1.Data();
    s1.sum();
  }
}