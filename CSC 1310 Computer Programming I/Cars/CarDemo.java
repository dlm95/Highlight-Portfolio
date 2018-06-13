import java.util.Scanner;
/**
 * Kenny Douglas 
 * 9/27/2013
 */
public class CarDemo
{
    public static void main(String[]args)
    
  {
      //create a Scanner object to read from the keyboard 
      
      Scanner keyboard = new Scanner (System.in);
      
      //declare variables 
      
      int speed; // the speed of the car 
      String Brand;
      int year;
      int brake;
      int accelerate; 
      
      // declare and initiate a car object 
      
      Car Kenny = new Car();

      
      System.out.println("What brand is your Car?");
     
      
      System.out.println("What year is your car?");
      year = keyboard.nextInt();
      
      
      
      System.out.println("your speed is  " + Kenny.getSpeed());
      
      System.out.println("your current speed is " + Kenny.getSpeed());
      Kenny.increaseSpeed();
      
      
      System.out.println("your speed increased to " +  Kenny.getSpeed());
      Kenny.increaseSpeed();
      
      
      System.out.println("your speed increased to " +  Kenny.getSpeed());
      Kenny.increaseSpeed();
     
      
      System.out.println("your speed increased to " +  Kenny.getSpeed());
      Kenny.increaseSpeed();
      
      
      System.out.println("your speed increased to " +  Kenny.getSpeed());
      Kenny.increaseSpeed();
       
      
      System.out.println("your current speed is " + Kenny.getSpeed());
      Kenny.decreaseSpeed();
      
       System.out.println("too fast, slow down ");
      
    
      System.out.println("your speed decreased to " +  Kenny.getSpeed() );
      Kenny.decreaseSpeed();
      
     
      System.out.println("your speed decreased to " +  Kenny.getSpeed());
      Kenny.decreaseSpeed();
     
      System.out.println("your speed decreased to " +  Kenny.getSpeed());
      Kenny.decreaseSpeed();
    
      System.out.println("your speed decreased to " +  Kenny.getSpeed());
      Kenny.decreaseSpeed();
      
      System.out.println("your speed decreased to " +  Kenny.getSpeed() );
      Kenny.decreaseSpeed();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }
}
