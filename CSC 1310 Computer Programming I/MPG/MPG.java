
/**
 * Calculates MPG
 * 
 * @author Derrick Murphy 
 * @version 9/9/13
 */
import java.util.Scanner;   //To be able to read from the keyboard

public class MPG
{

 public static void main(String [] args)
 
 {
  //Create a Scanner object to read from the keyboard 
  
  Scanner keyboard = new Scanner(System.in);
  
  double Miles;          //
  
  double Gallons;           //
  
  double MPG;         //
  
  // Input the Miles
  System.out.println ("Enter Miles");
  Miles=keyboard.nextDouble();
  
    // Input the Gallons
  System.out.println ("Enter Gallons");
  Gallons=keyboard.nextDouble();
  
  // Compute the ETA
  MPG=Miles/Gallons;
  
  // Display the farhrenheit and celsius temperatures
  System.out.println( "MPG is "+ MPG ); 
  }
}

