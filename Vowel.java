import java.util.*;
class Vowel{
  public static void main(String args[]){
    
    char vow;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your char:");
    vow=sc.next().charAt(0);
    if(vow=='a' || vow=='e' || vow=='i' || vow=='o' || vow=='u' ||vow=='A' || vow=='E' || vow=='I' || vow=='O' || vow=='U')
      System.out .println(vow  +" is vowel");
    else
      System.out .println(vow  +" is  consonent");
  }
}