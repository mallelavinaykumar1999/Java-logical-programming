import java.util.*;

class add{
  int c;
  
  // datatype name method name(args){}
  void add1(int x,int b){
    
    c=x+b;
    System.out.println(c);
   // System.out.println("eneter your name is"+sname);
  }
  void add2(int x,int y){
    int s;
    s=x-y;
    System.out.println(s);
  }
  void add3(int x,int y){
    int v;
    v=x*y;
    System.out.println(v);
  }
}

class Addmethod{
  public static void main(String args[]){
    int a,b;
    //String c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your a,b ");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("enter your operation :");
    String s1=sc.next();
    //System.out.println("eneter your name");
   // c=sc.next();
    
    //class name obj name=new c;lass name();
    add a1=new add();
    //objname.methodname();
    if(s1.equals("add")){
    a1.add1(a,b);
    }
    else if(s1.equals("sub")){
    a1.add2(a,b);
    }
    else{
    a1.add3(a,b);
    }
    
  }
}//input/process/output/datatypename methodnmae(args){}

/*
methods 4
with noo arguments and no return type
with arguments and no return type
with arguments and retuen type
with  no argments and  return type
instancwe variables 
local variables
sno
sname
s1
s2
s3



*/