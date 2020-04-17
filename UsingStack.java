import java.util.Scanner;

/**
 * This program uses a "MrCoxallStack" object as a stack.
 * 
 * @author Amin Zeina
 * @version 2.0
 * @since 2020-04-17
 */

public class UsingStack {
   
  /**
  * This class gets numbers to add to the "stack" and uses push() to add them to the list.
  */
  
  public static void main(String[] args) {
    
    // Declare variables
    int numberEntered;
    
    // Create objects
    Scanner userInput = new Scanner(System.in);
    MrCoxallStack coxallStack = new MrCoxallStack();
    
    // Loop for user to enter multiple numbers
    while (true) {
      System.out.print("Enter an integer to be added to the stack: ");
      try {
        numberEntered = userInput.nextInt();
        userInput.nextLine();
      } catch (Exception e) {
        System.err.println("That is not an integer, please try again.");
        userInput.nextLine();
        continue;
      }
      
      // Add number to the stack
      coxallStack.push(numberEntered);
      
      // Call printStack() to show stack contents
      coxallStack.printStack();
      
      System.out.print("Do you want to enter another number? (yes/no): ");
      
      if (!userInput.nextLine().toLowerCase().equals("yes")) {
        break;
      }
    }
    System.out.print("Program End.");
  }
}