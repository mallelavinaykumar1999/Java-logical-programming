import java.util.*;
class array1{
int i=0;
  Scanner sc=new Scanner(System.in);
  int x[];
  int ser;
  int c=0;
void getarray(int x[]){
  System.out.println("enter your array elements");
  for(i=0;i<x.length;i++){
    x[i]=sc.nextInt();
  }
}
  void displayArray(int x[]){
    System.out.println("your elements in array is :");
  for(i=0;i<x.length;i++){
    System.out.println(x[i]);
  }
}
  void serchArray(int x[]){
  System.out.println("enter your elements to search:");
  ser=sc.nextInt();
for(i=0;i<x.length;i++){
  if(x[i]==ser){
    System.out.println("the element is found");
    c=1;
  }  
}
if(c==0){
  System.out.println("the element is not found");
}

  }
}

class linearSerarchmethod{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your array size");
    n=sc.nextInt();
    int a[]=new int[n];
    array1 a1=new array1();
    a1.getarray(a);
    a1.displayArray(a);
    a1.serchArray(a);
    
  }
}