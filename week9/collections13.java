/* Write a Java program to insert elements into the linked list at the first and last position.*/
import java.util.LinkedList;
  public class collections13 {
  public static void main(String[] args) {
     LinkedList<String> l_list = new LinkedList<String>();
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
     System.out.println("Original linked list:" + l_list);    
    l_list.addFirst("White");
 
    l_list.addLast("Pink");
     System.out.println("Final linked list:" + l_list);  
 }
}