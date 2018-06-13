
import java.util.Scanner;

public class resortSpaDemo
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String suite;
        String spa;
        String meal; 
        String suiteName="";
        
        int days;
        double tax = .10;
        double plan;
        double occp;
        double total;
        
            resortSpa crs = new resortSpa();
        
       
            System.out.println("Would you like to stay in the D(Deluxe)suite or E(Executive)suite?");
            suite = keyboard.next();
            char suitechar = suite.charAt(0);
            crs.setSuiteP(suitechar);
            
            
            System.out.println("Would you like spa access, Y or N?" );
            spa = keyboard.next(); 
            char spachar = spa.charAt(0);
            crs.setSpaP(spachar);
            
            System.out.println("Would you like the meal plan, Y or N?");
            meal = keyboard.next();
            char mealchar = meal.charAt(0);
            crs.setMealP(mealchar);
            
            System.out.println("How many days are you staying?");
            days = keyboard.nextInt();
            
            plan = (crs.getSuiteP() + crs.getSpaP() + crs.getMealP()) * days;
            
            occp = plan * tax;
            
            total = plan + occp;
            

            if (suitechar == 'E')
            {
                suiteName = "Executive";
            }
            else if (suitechar == 'D')
            {
                suiteName = "Deluxe";
            }
 
             System.out.println("*************************************************************");
             System.out.println("                   Caldwell Spa & Resort");
             System.out.println("*************************************************************");
             
             
             System.out.println("Type of Suite:                         " + suiteName);
             System.out.println("Suite cost:                            " + crs.getSuiteP());
             System.out.println("Spa cost:                              " + crs.getSpaP());
             System.out.println("Meal cost:                             " + crs.getMealP());
             System.out.println("Days Stayed:                           " + days);
             System.out.println("Occupancy Tax:                         10%" );
             System.out.println("Total Amount Due:                      " + total);
             
             
             
    }
}
