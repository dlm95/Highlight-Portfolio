
import java.util.Scanner;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class PreferredCustomerDemo
{
  public static void main (String [] Args)
   {
    PreferredCustomer pc = new PreferredCustomer();
      Finch myFinch = new Finch();
     double discountLevel;
     double purchases;
     
     
     Scanner keyboard = new Scanner (System.in);
     System.out.println("What was the total amount of purchases so far:  ");
     purchases = keyboard.nextDouble();
     {
         if (purchases >= 500  && purchases <1000)
        {discountLevel = 0.05;
        System.out.println("you have earned a 5 percent discount on all future purchases");
        myFinch.setLED(0, 255, 0);
       // myFinch.setWheelVelocities(255, 0, 1000);
        myFinch.saySomething("Congradulations you now have five percent discount on all other orders", 4000);
        myFinch.sleep(4000);
    }else
        if (purchases >= 1000 && purchases <1500)
       { discountLevel = 0.06;
        System.out.println("you have earned a 6 percent discount on all future purchases");
        myFinch.setLED(0, 255, 0); 
        myFinch.saySomething("Congradulations you now have six percent discount on all other orders", 4000);
    }else
        if (purchases >= 1500 && purchases <2000)
       { discountLevel = 0.07;
        System.out.println("you have earned a 7 percent discount on all future purchases");
        myFinch.setLED(0, 255, 0); 
        myFinch.saySomething("Congradulations you now have seven percent discount on all other orders", 4000);
        myFinch.sleep(4000);
    }else
    if (purchases >= 2000)
    { discountLevel = 0.10;
        System.out.println("you have earned a 10 percent discount on all future purchases");
        myFinch.setLED(0, 255, 0); 
        myFinch.saySomething("Congradulations you now have ten percent discount on all other orders", 4000);
        myFinch.sleep(4000);
     }else{
       System.out.println("No Discount Available");
       myFinch.setLED(255, 0, 0); 
        myFinch.saySomething("There are no available discounts", 4000);
    }
    myFinch.quit();
    System.exit(0);
     }
  }
}