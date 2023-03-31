/******************************************************************************
A restaurant wants to keep track of its menu items. 
Each menu item has a name, a description, a price, and a category (appetizer, main course, dessert, etc.).
The restaurant wants to be able to perform the following operations:Add a new menu item to the menu
Remove a menu item from the menuSearch for a menu item by name or categoryDisplay all the menu items in the menu,
grouped by categoryTo implement this functionality, you decide to use a collection in Java.Question: 
Write a Java program that implements the above scenario using a collection. 
Your program should have a MenuItem class that stores the details of a menu item (name, description, price, and category).
Implement a collection to store the menu items in the restaurant's menu.
Your program should have methods to add a menu item, remove a menu item, search 
for a menu item by name or category, and display all the menu items grouped by category.
Test your program by adding several menu items to the menu, searching for a menu item, 
and displaying all the menu items grouped by category.

*******************************************************************************/
import java.util.*;
class MenuItem{
    String name,description,category;
    int price,unId;
    
    Scanner sc=new Scanner(System.in);
    void addItem(int unId){
        this.unId=unId;
        System.out.println("Enter name of the item :");
        name=sc.nextLine();
        System.out.println("Enter description of the item:");
        description=sc.nextLine();
        System.out.println("enter categoryof the item(appetizer, main course, dessert, etc.).");
        category=sc.nextLine();
        System.out.println("enter price of the item :");
        price=sc.nextInt();
        
    }
    void displayAll(){
        System.out.println("---Item---");
        System.out.println("The item code is : "+unId);
        System.out.println("The item name is : " +name);
        System.out.println("The item description is :"+description);
        System.out.println("The item category is : "+category);
    }
    
    
    static void removeItem(ArrayList<MenuItem> alist,int icode){
        int c=0;
        MenuItem object=null;
        for(MenuItem item:alist){
            if(item.unId==icode){
            alist.remove(item);
            }
        }
    
    }
}






public class c20code
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int unId=0;
	    ArrayList<MenuItem> alist=new ArrayList<>();
	    do{
		System.out.println("-----Menu Items Methods-----");
		System.out.println("[1]. To add a New Item to the Menu");
		System.out.println("[2]. To Display all the items in Menu");
		System.out.println("[3]. To Remove that item in the Menu");
		System.out.println("[0]. To exit");
		System.out.println("Enter your choices");
		int n=sc.nextInt();
		
		switch(n){
		    case 1:
		       MenuItem obj=new MenuItem();
		       unId++;
		       obj.addItem(unId);
		       alist.add(obj);
		        break;
		    case 2:
		        for(int i=0;i<alist.size();i++){
		            alist.get(i).displayAll();
		        }
		        break;
		    case 3:
		        System.out.println("Enter item code to remove");
		        int icode=sc.nextInt();
		        MenuItem.removeItem(alist,icode);
		        break;
		   case 0:
		       System.exit(0);
		       break;
		       
		   default:
		     System.out.println("Invalid choice");
		}
	    }while(true);
		
	}
}
