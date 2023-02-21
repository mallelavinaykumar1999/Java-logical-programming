/******************************************************************************
A university has different types of employees, including faculty members and administrative staff.
The university wants to keep track of their personal information, such as their names and contact details,
as well as their job-specific information, such as their salary and job title.
Create a superclass called "Employee" with the following
attributes:name (String)
email (String)
phone number (String)
Create two subclasses of Employee:
FacultyMember, with the additional attribute of "department" (String)
AdministrativeStaff, with the additional attribute of "jobTitle" (String)
Create a constructor for each subclass that initializes its respective additional attribute(s)
along with the attributes inherited from the superclass.
Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass.
In the main method, create at least one object of each subclass and call the respective method to display their attributes.

*******************************************************************************/
import java.util.*;
class Employee{
    String name,email,phn;
    Scanner sc=new Scanner(System.in);
   Employee(){
        System.out.println("enter your name :");
        name=sc.nextLine();
        System.out.println("enter youe email");
        email=sc.nextLine();
        System.out.println("enter your phnone number :");
        phn=sc.next();
    }
}
class FacultyMember extends Employee{
    String dep;
    Scanner sc=new Scanner(System.in);
    FacultyMember(){
        System.out.println("enter your department name:");
        dep=sc.nextLine();
    }
    void Display(){
        System.out.println(" the employee name is : "+name);
         System.out.println(" the employee email is : "+email);
          System.out.println(" the employee phone number is : "+phn);
           System.out.println(" the employee department  is : "+dep);
        
    }
}
class AdministrativeStaff extends Employee{
    String jt;
    Scanner sc=new Scanner(System.in);
    AdministrativeStaff(){
        System.out.println("enter your job title:");
        jt=sc.nextLine();
    }
    void Display(){
        System.out.println(" the employee name is : "+name);
         System.out.println(" the employee email is : "+email);
          System.out.println(" the employee phone number is : "+phn);
           System.out.println(" the employee job title  is : "+jt);
        
    }
}

public class c20code
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter your position(faculty/staff");
	String pos=sc.nextLine();
	if(pos.equalsIgnoreCase("faculty")){
	    FacultyMember f1=new FacultyMember();
	    f1.Display();
	}
	else{
	    AdministrativeStaff a1=new AdministrativeStaff();
	    a1.Display();
	}
	}
}

