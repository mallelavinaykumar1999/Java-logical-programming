/***************************************************************************
 * Write a class Worker and derive classes DailyWorker and SalariedWorker from it. 
 * Every worker has a name and a salary rate. Write method ComPay (int hours) to compute 
 * the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works.
 * The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. 
 * Test this program to calculate the pay of workers.

*******************************************************************************/
import java.util.*;
abstract class worker{
    abstract void ComPay(String s,int n);
}

class DailyWorker extends worker{
    int sal=0;
    void ComPay(String s,int n){
        sal=n*500;
        System.out.println("DailyWorker name : "+s);
        System.out.println("salary : "+sal);
    }
}

class SalariedWorker extends worker{
    int sal=0,h;
    void ComPay(String s,int n){
        if(n>40){
            sal=10000;
        }
        else{
            h=40-n;
            sal=10000-(h*100);
        }
        System.out.println("SalariedWorker name : "+s);
        System.out.println("salary : "+sal);
    }
    
}


public class Worker
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter type of worker");
	 String wor=sc.nextLine();
	 System.out.println("enter your name :");
	     String s1=sc.next();
	 
	 if(wor.equalsIgnoreCase("Daily worker")){
	     
	     System.out.println("enter your how many days you worked ");
	     int day=sc.nextInt();
	     DailyWorker d1=new DailyWorker();
	     d1.ComPay(s1,day);
	}
	 else{
	     System.out.println("enter your how many hours you worked ");
	     int hours=sc.nextInt();
	   
	     SalariedWorker s2=new SalariedWorker();
	     s2.ComPay(s1,hours);
	 }
		
	}
}