import java.util.Scanner;
import java.util.Stack;

/**
 * This program uses a stack to store user integers.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-03-23
 */
 
public class MrCoxallStack {
  
  /**
  * This class gets user input and calls the push() method.
  * https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
  */
  
  public static void main(String[] args) {
    
    // Declare variables
    String enterAgain;
    int numberEntered;
    boolean programEnded = false;
    Stack<Integer> numberStack = new Stack<Integer>();
    
    Scanner userInput = new Scanner(System.in);
    
    // Loop for user to play again if they want to 
    while (programEnded == false) {
      System.out.print("Enter an integer to be added to the stack: ");
      try {
        numberEntered = userInput.nextInt();
        userInput.nextLine();
        numberStack.push(numberEntered);
      } catch (Exception e) {
        System.err.println("That is not an integer, please try again.");
        userInput.nextLine();
        continue;
      }
      /* Printing Stack with toString() to ensure that the program is actaully working and leaving 
      the brackets since this will be removed with the next assignments(Testing purposes).
      */
      System.out.println("The stack now contains: " + numberStack.toString());
      
      System.out.print("Do you want to enter another number? (yes/no): ");
      // Convert to lower case so any capitalization is valid
      enterAgain = userInput.nextLine().toLowerCase();
      
      if (enterAgain.equals("yes")) {
        // User wants to enter another number
        programEnded = false;
      } else {
        // User wants doesn't want to enter another number
        programEnded = true;
      }
    }
    System.out.print("Program End.");
  } 
}