import java.util.Scanner;
public class c201003 {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 // Read input from user
 System.out.print("Enter a series of numbers (separated by spaces): ");//5 3 8 2 7 1 4  // 5 3 1 2 7 8 4  
 String userInput = input.nextLine();
 // Convert input to an array of integers
 String[] numbers = userInput.split(" ");
 int[] intArray = new int[numbers.length];
 for (int i = 0; i < numbers.length; i++) {
 intArray[i] = Integer.parseInt(numbers[i]);
 }
 
 // Rearrange the numbers so that all odd numbers come first, followed by even numbers
 int left = 0;//0
 int right = intArray.length - 1;//6
 while (left < right) {//4<3
 while (intArray[left] % 2 != 0 && left < right) {//  f && 2<6
 left++;//2
 }
 while (intArray[right] % 2 == 0 && left < right) {// f && 2<5
 right--;//5
 }
if (left < right) {//3<4
 int temp = intArray[left];//2
 intArray[left] = intArray[right];//7
 intArray[right] = temp;//2
 left++;
 right--;
 }
 }
 // Print the rearranged list of numbers
 System.out.print("Rearranged list: ");
 for (int i = 0; i < intArray.length; i++) {
 System.out.print(intArray[i] + " ");
}
 System.out.println();
 
 input.close();
 }
}