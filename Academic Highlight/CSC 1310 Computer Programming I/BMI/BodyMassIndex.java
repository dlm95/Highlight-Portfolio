
/**
 * To calculate the BMI of a person
 * 
 * Kenny, Derrick, Fredrick
 * 9/16/2013
 */
import java.util.Scanner;   //To be able to read from the keyboard

public class BodyMassIndex
{

 public static void main(String [] args)
 
 {
  //Create a Scanner object to read from the keyboard 
  
  Scanner keyboard = new Scanner(System.in);
  
  double weight;
  
  double height;
  
  double BMI;            
  
// Input
  System.out.println ("Enter Weight in Lbs");
  weight=keyboard.nextDouble();
  
  System.out.println ("Enter Height in In.");
  height=keyboard.nextDouble();
 

// Compute
BMI=(weight*703)/(height*height);

  
  // Display
  System.out.println( "Your BMI is "+ BMI ); 

  }
}