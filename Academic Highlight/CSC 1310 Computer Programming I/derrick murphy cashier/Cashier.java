
/**
 * Calculate correct change to customer
 * 
 * @author Derrick Murphy 
 * @version 9/13/13
 */
import java.util.Scanner;   //To be able to read from the keyboard

public class Cashier
{

 public static void main(String [] args)
 
 {
  //Create a Scanner object to read from the keyboard 
  
  Scanner keyboard = new Scanner(System.in);
 
  double total;
  
  double received;
  
  double change;

  int dollars, quarters, dimes, nickels, pennies;

//input data
System.out.print ("Enter total: ");
total=keyboard.nextDouble();
  
System.out.print ("Enter Amount Paid: ");
received=keyboard.nextDouble();
 
// Compute differnce
change=received-total;
System.out.println( "Change due: "+ change );

//calculate change due in coin
dollars = (int) (change / 1);
change = change - dollars * 1;

quarters = (int)(change / .25);
change = change - quarters * .25;

dimes = (int)(change / .10);
change = change - dimes * .10;

nickels = (int)(change / .05);
change = change - nickels * .05;

pennies = (int)(change / .01);
change = change - pennies;



    
// Display the change due
System.out.println("Dollars: " + dollars);
System.out.println("Quarters: " + quarters); 
System.out.println("Dimes: " + dimes);
System.out.println("Nickels: " + nickels);
System.out.println("Pennies: " + pennies);





  

  }
}