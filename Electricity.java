
/* Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,
Calculate Total units & Electricity bill and print the report.
1-50          ------->   1.45
   51-100      ------>     2.56
   100-200    ------->    3.50
   200-300   -------->   4.67
   above 300 -------->  5.67
 */
import java.util.*;

class Electricity {
  public static void main(String args[]) {
    int cno, pmr, lmr, tu;
    String cname;
    double cbill;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter consumer number :");
    cno = sc.nextInt();
    System.out.println("enter consumer  name :");
    cname = sc.next();
    System.out.println("enter last month reading :");
    lmr = sc.nextInt();
    System.out.println("enter present month reading :");
    pmr = sc.nextInt();

    tu = pmr - lmr;
    System.out.println(" ELECTRICITY BILL DETAILS ");
    System.out.println(" ------------------------");
    System.out.println("your consumer number is " + cno);
    System.out.println("your consumer name is " + cname);
    System.out.println("your last month reading is " + lmr);
    System.out.println("your present month readingis " + pmr);
    System.out.println("total units of " + cno + " is " + tu);
    if (tu <= 50) {
      cbill = tu * 1.45;
      
    } else if (tu <= 100) {
      cbill = (50 * 1.45) + ((tu - 50) * 2.56);
      
    } else if (tu <= 200) {
      cbill = (50 * 1.45) + (50 * 2.56) + ((tu - 100) * 3.50);
      
    } else if (tu <= 300) {
      cbill = (50 * 1.45) + (50 * 2.56) + (100 * 3.50) + ((tu - 200) * 4.67);
      
    } else  {
      cbill = (50 * 1.45) + (50 * 2.56) + (100 * 3.50) + (100 * 4.67) + ((tu - 300) * 5.67);
      
    }
    System.out.println("current bill of " + cno + " is " + cbill);
  }
}