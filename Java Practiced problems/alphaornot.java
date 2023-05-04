
/******************************************************************************

Write a JAVAprogram to check whether a character is alphabet or not.

*******************************************************************************/
import java.util.*;

public class alphaornot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your  char");
    char ch = sc.next().charAt(0);
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      System.out.println("it is alphabet");
    } else {
      System.out.println("it is not alphabet");
    }

  }
}
