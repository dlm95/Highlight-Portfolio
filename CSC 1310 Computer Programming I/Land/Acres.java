
/**
 * Calculates Acres
 * 
 * @author Derrick Murphy 
 * @version 9/9/13
 */
import java.util.Scanner;   //To be able to read from the keyboard

public class Acres
{

 public static void main(String [] args)
 
 {
  //Create a Scanner object to read from the keyboard 
  
  Scanner keyboard = new Scanner(System.in);
  
  double acre; 
  acre = 43560;
  
  double land; 
  
  double AcreS;         //
  
  System.out.print( "Enter Land");
  land=keyboard.nextDouble();
  
  // Compute the Acres
  AcreS=land/acre;
  
  // Display the farhrenheit and celsius temperatures
  System.out.println( AcreS ); 
  }
}

