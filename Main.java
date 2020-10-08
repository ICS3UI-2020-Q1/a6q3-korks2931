import java.util.Scanner; 
/**
 *This program will tell the user the biggest number they entered in the array 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter in 10 integers to put into the array");
    
    final int NUM_INTEGERS = 10; 
    int[] integers = new int[NUM_INTEGERS];
    
   // make a for loop statement for array to go through loop
    for( int i = 0; i < NUM_INTEGERS; i++){
      // make the user enter the next numbers
      integers[i] = input.nextInt();
      
    }
    // declare a variable to store largest
    int largest = integers[0];
      // make a for loop to find the largest integer 
     for( int i = 0; i < NUM_INTEGERS ; i++){
    // make an if statement to find which one is larger.
     if (largest < integers[i]){
       // swap the largest 0 to next integer 
      largest = integers[i];

     }
     }
     // tell the user which one is the largest one 
      System.out.println("The largest number is " + largest);
    
    
      
    
    

    
  }
}
