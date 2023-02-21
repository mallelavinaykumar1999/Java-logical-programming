/*A school has different types of students, including undergraduates, graduates, and doctoral students. The school wants to keep track of each student's personal information, such as their names and contact details, as well as their academic information, such as their major and GPA. Create a superclass called "Student" with the following attributes: name (String)
email (String)
phone number (String)
major (String)
GPA (double)
Create three subclasses of Student: Undergraduate, with the additional attribute of "class standing" (String)
Graduate, with the additional attribute of "program" (String)
Doctoral, with the additional attribute of "advisor" (String)
Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes. Also, update the GPA of each student as they complete new courses or exams.*/

import java.util.*;
 class Student
{
    protected String phn;
  protected String gmail;
    protected String name;
    protected double gpa;
    
    public void setName(String name)
    {
     this.name = name;
    }
  public void setgmail(String gmail)
    {
     this.gmail = gmail;
    }
   /* public String getName()
    {
     return name;
    }*/
   public void setphn(String phn)
    {
     this.phn = phn;
    }
    /*public String getphn()
    {
     return phn;
    }*/
  
  public void setgpa(double gpa)
    {
     this.gpa = gpa;
    }
   /* public Double getgpa()
    {
     return gpa;
    }*/
  
    
}
class UnderGraduate extends Student{
  String cs;
  Scanner sc=new Scanner(System.in);
  UnderGraduate(){
    System.out.println("enter your class Standing ");
    cs=sc.nextLine();
  }
  void Display(){
    System.out.println(" the student name is : "+name);
     System.out.println(" the student gmail is : "+gmail);
    System.out.println(" the student phn number is : "+phn);
    System.out.println(" the student class standing is : "+cs);
    System.out.println(" the student gpa is : "+gpa);
    
  }
}
class Graduate extends Student{
  String program;
  Scanner sc=new Scanner(System.in);
  Graduate(){
    System.out.println("enter your program ");
    program=sc.nextLine();
  }
  void Display(){
    System.out.println(" the student name is : "+name);
    System.out.println(" the student gmail is : "+gmail);
    System.out.println(" the student phn number is : "+phn);
    System.out.println(" the student program is : "+program);
    System.out.println(" the student gpa is : "+gpa);
    
  }
}
class Doctoral extends Student{
  String ad;
  Scanner sc=new Scanner(System.in);
  Doctoral(){
    System.out.println("enter your advisor ");
    ad=sc.nextLine();
  }
  void Display(){
    System.out.println(" the student name is : "+name);
    System.out.println(" the student phn number is : "+phn);
    System.out.println(" the student advisor is : "+ad);
    System.out.println(" the student gpa is : "+gpa);
    
  }
}

public class C20week6
{
      
     public static void main(String[] args){
       String name;
     String phn,gmail;
   double gpa; 
       Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
       name=sc.nextLine();
       System.out.println("enter your gmail");
       gmail=sc.nextLine();
       System.out.println("enter your phone number");
       phn=sc.nextLine();
       System.out.println("enter your gpa");
       gpa=sc.nextDouble();
       System.out.println("enter your type of student(ug/g/doc)");
       String type=sc.next();
       if(type.equalsIgnoreCase("ug")){
         UnderGraduate u1=new UnderGraduate();
       u1.setName(name);
         u1.setgmail(gmail);
       u1.setphn(phn);
       u1.setgpa(gpa);
       u1.Display();
       }
       else if(type.equalsIgnoreCase("g")){
         Graduate g1=new Graduate();
       g1.setName(name);
         g1.setgmail(gmail);
       g1.setphn(phn);
       g1.setgpa(gpa);
       g1.Display();
       }
       else {
         Doctoral d1=new Doctoral();
       d1.setName(name);
         d1.setgmail(gmail);
       d1.setphn(phn);
       d1.setgpa(gpa);
       d1.Display();
       }
 }
 }