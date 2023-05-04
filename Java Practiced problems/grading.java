/******************************************************************************
Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your five subjects marks");
	    int physics=sc.nextInt();
	    int chemistry=sc.nextInt();
	    int Biology=sc.nextInt();
	    int Maths=sc.nextInt();
	    int computer=sc.nextInt();
	    int tot;
	    int per;
	    
	    tot=(physics+chemistry+Biology+Maths+computer);
	    per=tot/5;
	    if(per>=90){
	        System.out.println("Grade A");
	    }
	    else if(per>=80 && per<90){
	        System.out.println("Grade B");
	    }
	    else if(per>=70 && per<80){
	        System.out.println("Grade C");
	    }
	    else if(per>=60 && per<70){
	        System.out.println("Grade D");
	    }
	    else if(per>=40 && per<60){
	        System.out.println("Grade E");
	    }
	    else{
	        System.out.println("Grade F");
	    }
	    
		
	}
}
