
/**
 * Calculates profit
 * 
 * @author Derrick Murphy 
 * @version 9/9/13
 */
import java.util.Scanner;   //To be able to read from the keyboard

public class Profit
{

 public static void main(String [] args)
 
 {
  //Create a Scanner object to read from the keyboard 
  
  Scanner keyboard = new Scanner(System.in);
  
  double retail;
  
  double extra;
  extra = 0.4;           //
  
  double prof;         //
  
  // Input the reatial
  System.out.println ("Enter Retail");
  retail=keyboard.nextDouble();
 
  
  // Compute the ETA
  prof=retail*extra;
  
  // Display the farhrenheit and celsius temperatures
  System.out.println( "Profit is "+ prof ); 
  }
}


