/******************************************************************************
Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
*******************************************************************************/
import java.util.*;
public class grosssalary
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your Basic salary : ");
	    int sal=sc.nextInt();
	    double tot;
	    if(sal<=10000){
	        tot=(sal)+((sal*0.20)+(sal*0.80));
	    }
	    else if(sal<=20000){
	        tot=(sal)+(sal*0.25)+(sal*0.90);
	    }
	    else{
	        tot=(sal)+(sal*0.30)+(sal*0.95);
	    }
	    System.out.println("Your gross salary is "+tot);
	    
		
	}
}
