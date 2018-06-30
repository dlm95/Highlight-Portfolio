
import java.util.Scanner;
public class resortSpaDemo
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String suite;
        String spachoice;
        String mealchoice; 
        int days;  
        double spa = 0;
        double mealplan = 0; 
        double tax = .10;
        double totalprice; 
        double moneydue;
        double D;
        double E; 
        double suiteprice = 0;
        
            resortSpa crs = new resortSpa();
        
       
            System.out.println("Would you like to stay in the D(Deluxe)suite or E(Executive)suite?");
            suite = keyboard.next();
            char charsuite = suite.charAt(0);
            crs.setSuite(suiteprice,charsuite);
            
            
            System.out.println("Would you like spa access, Y or N?" );
            spachoice = keyboard.next(); 
            char charspachoice = spachoice.charAt(0);
            crs.setSpa(spa, charspachoice);
            
            System.out.println("Would you like the meal plan, Y or N?");
            mealchoice = keyboard.next();
            char charmealchoice = mealchoice.charAt(0);
            crs.setMealplan(mealplan, charmealchoice);
            
            System.out.println("How many days are you staying?");
            days = keyboard.nextInt();
            
            
             totalprice = ((crs.getSuite() + crs.getSpa() + crs.getMealplan() * days) * tax);
             
             moneydue = (crs.getSuite() * days); 
             
             double amountafter = (moneydue + crs.getSpa() + crs.getMealplan() + totalprice); 
                    
             System.out.println("Type of Suite: " + charsuite);
             System.out.println("Days Stayed: " + days);
             System.out.println("Suite cost: " + crs.getSuite());
             System.out.println("Spa cost: " + crs.getSpa());
             System.out.println("Meal cost: " + crs.getMealplan());
             System.out.println("Total Amount Due: " + amountafter);
             
             
             
    }
}
