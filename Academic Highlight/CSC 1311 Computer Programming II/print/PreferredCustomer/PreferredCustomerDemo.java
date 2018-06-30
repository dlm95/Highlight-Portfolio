
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
        myFinch.saySomething("You earned five percent discount");
    }
        if (purchases >= 1000 && purchases <1500)
       { discountLevel = 0.06;
        System.out.println("you have earned a 6 percent discount on all future purchases");
    }
        if (purchases >= 1500 && purchases <2000)
       { discountLevel = 0.07;
        System.out.println("you have earned a 7 percent discount on all future purchases");
    }
        if (purchases >= 2000)
       { discountLevel = 0.10;
        System.out.println("you have earned a 10 percent discount on all future purchases");
        
    }
    else{
        System.out.println("You have not earned any discounts yet.");
    }
}
myFinch.quit();
      System.exit(0);
}
  }   
   
     
     
     
    
      
      
      
      
      