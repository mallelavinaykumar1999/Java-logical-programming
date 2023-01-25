import java.util.*;
class Monthswitch{
  public static void main(String args[]){
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  month num:");
    a=sc.nextInt();
    switch(a){
      case 1:
      System.out.println("Jan it has 31 days");
        break;
     case 2:
      System.out.println("Feb it has 28 days");
         break;
     case 3:
      System.out.println("march it has 31 days");
         break;
     case 4:
      System.out.println("april it has 30 days");
         break;
     case 5:
      System.out.println("may it has 31 days");
         break;
     case 6:
      System.out.println("june it has 30 days");
         break;
     case 7:
      System.out.println("july it has 31 days");
         break;
    case 8:
      System.out.println("aug it has 31 days");
         break;
     case 9:
      System.out.println("sept it has 30 days");
         break;
     case 10:
      System.out.println("oct it has 31 days");
         break;
     case 11:
      System.out.println("nov it has 30 days");
         break;
      case 12:
      System.out.println("dec it has 31 days");
         break;
      default:
      System.out.println("invalid input provide between 1 to 7");
    }
  }
}