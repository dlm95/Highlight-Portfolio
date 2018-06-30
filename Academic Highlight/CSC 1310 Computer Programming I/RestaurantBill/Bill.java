/**
 * Shows meal charge, tax, tip, and full total
 * 
 * @author Derrick Murphy 
 * @version 9/9/13
 */
import java.util.Scanner;   //To be able to read from the keyboard

public class Bill
{

 public static void main(String [] args)
 
 {
  //Create a Scanner object to read from the keyboard 
  
  Scanner keyboard = new Scanner(System.in);
  
  double charge;
  
  double Taxes;
  double Tip;
  
  double tax;
  tax = .0675;
  
  double tip;
  tip = 0.15;
  
  double total;            
  
// Input charge
  System.out.println ("Enter charge");
  charge=keyboard.nextDouble();
 

// Compute the tipand tax
Taxes=charge*tax;
Tip=charge*tip;
total=charge+tax+tip;
  
  // Display the farhrenheit and celsius temperatures
  System.out.println( "Charge is "+ charge ); 
  System.out.println( "Tax is "+ Taxes );
  System.out.println( "Tip is "+ Tip );
  System.out.println( "Total is "+ total ); 
  }
}