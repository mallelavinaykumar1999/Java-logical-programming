/* Write a Java program to iterate through all elements in a linked list starting at the specified position.*/
import java.util.LinkedList;
import java.util.Iterator;
  public class collections11 {
  public static void main(String[] args) {
   
     LinkedList<String> l_list = new LinkedList<String>();

          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");
// set Iterator at specified index
   Iterator p = l_list.listIterator(1);

   // print list from second position
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}