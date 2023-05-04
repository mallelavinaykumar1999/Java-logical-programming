import java.util.*;

class PerfectNum {
  void perfectNum(int num1, int num2) {
    int sum = 0;
    for (int i = num1; i <= num2; i++) {// 6 to 10 7
      sum = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          sum += j;
        }

      }
      if (i == sum) {
        System.out.println(i);
      }
    }
  }
}

public class PerfectNumberInterval {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your starting num");
    int num1=sc.nextInt();
    System.out.println("enter your ending num");
    int num2=sc.nextInt();
    PerfectNum p1=new PerfectNum();
    System.out.println("your perfect numb")
    p1.perfectNum(num1,num2);
  }
}