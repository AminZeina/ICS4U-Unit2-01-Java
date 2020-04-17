import java.util.ArrayList;


/**
 * This program contains the MrCoxallStack class.
 * 
 * @author Amin Zeina
 * @version 2.0
 * @since 2020-04-17
 */
 
public class MrCoxallStack {
  
  /**
  * This class is the "stack" and stores the values pushed to the stack using an arraylist.
  */
  
  ArrayList<Integer> stackList = new ArrayList<Integer>(); 
  
  // "push" to stack by adding to end of list.
  public void push(int valueToPush) {
    stackList.add(valueToPush);
  }
  
  /* Print contents of stack, using toString() since this is just for testing, 
  will change in 2-02 */  
  public void printStack() {
    System.out.println("Stack contains: " + stackList.toString());
  }
}
