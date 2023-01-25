import java.util.Scanner;

class Evenodd {
  public static void main(String args[]) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num:");
    a = sc.nextInt();

    if (a % 2 == 0)
      System.out.println("its even number");
    else
      System.out.println("its odd number");
  }
}