import java.util.*;
class Season{
  public static void main(String args[]){
    int mno;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  your month num(1 to 12)):");
    mno=sc.nextInt();
   
    switch(mno){
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("its summer season");
         break;
      case 7:
      case 8:
      case 9:
      case 10:
          System.out.println("its rainy season");
         break;
        
      case 11 :
      case 12 :
      case 1:
      case 2:
       System.out.println("its winter season");
         break;
      default:
      System.out.println("invalid input");
    }
    
    
  }
}