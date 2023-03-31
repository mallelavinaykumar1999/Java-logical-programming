/* Write a Java program to get the first and last occurrence of the specified elements in a linked list.*/
import java.util.LinkedList;
import java.util.Iterator;
  public class collections14 {
  public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<String>();
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
   System.out.println("Original linked list:" + l_list);  
 
   
    Object first_element = l_list.getFirst();
    System.out.println("First Element is: "+first_element);
 
    Object last_element = l_list.getLast();
    System.out.println("Last Element is: "+last_element);
 }
}