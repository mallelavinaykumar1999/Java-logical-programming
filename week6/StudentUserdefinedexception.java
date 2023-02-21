import java.util.*;
 class FailException extends Exception{
  FailException(){
    System.out.println("you got failed");
  }
}


class StudentUserdefinedexception{
  public static  void student() throws FailException {
    int s_no,s1,s2,s3,tot;
    String s_name;
    double avg;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter student number :");
    s_no=sc.nextInt();
    System.out.println("enter student  name :");
    s_name=sc.next();
    System.out.println("enter subject1,subject2,subject3 marks :");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s3=sc.nextInt();
    if (s1 < 40 || s2 < 40 || s3 < 40) 
    {
      throw new FailException();
    }
     tot=(s1+s2+s3);
    avg=(tot/3);

    System.out.println("the total of your marks is"+tot);
    System.out.println("the average of your marks is "+avg);
  }




  public static void main(String args[]){
    try{
      student();
    }
    catch(FailException f){
      System.out.println(f);
    }
  }
}