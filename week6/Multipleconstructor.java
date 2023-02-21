class Student
{
    int a,b;
    Student(){
        System.out.println("this is a default constructor");
    }
    Student(int x){
        System.out.println("the value of the x is "+x);
    }
    Student(int x,int y)
     {
         a=x;
         b=y;
     }
     void display(){
         System.out.println("the a value is "+a);
         System.out.println("the a value is "+b);
     }
}
public class Multipleconstructor
{
     public static void main(String[] args){
        Student s1=new Student(100,200);
        s1.display();
        Student s2=new Student();
        Student s3=new Student(15);
         
 }
 }