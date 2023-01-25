 
    /* write  a prgram to print student number and student names and 3 subject marks and calculate total and average print an report with no arguments and no return type*/
import java.util.*;
class Student{
  Scanner sc=new Scanner(System.in);
  int s_no,s1,s2,s3,tot;
    String s_name;
    float avg;
  void marks(){
    System.out.println("enter student number :");
    s_no=sc.nextInt();
    System.out.println("enter student  name :");
    s_name=sc.next();
    System.out.println("enter subject1,subject2,subject3 marks :");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s3=sc.nextInt();
    tot=(s1+s2+s3);
    avg=((float)tot/3);
    
    System.out.println("your student number is "+ s_no);
    System.out.println("your student name is " + s_name);
    System.out.println("your subect1 is " + s1);
    System.out.println("your subect2 is " + s2);
    System.out.println("your subect3 is " + s3);
    System.out.println("total marks of " + s_name+ " is "+tot);
    System.out.println("average  marks of " + s_name+ " is "+avg);
  }
}



class Studentmarks{
  public static void main(String args[]){
    Student s1=new Student();
    s1.marks();
  }
}