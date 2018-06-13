import java.util.Scanner;
import java.text.DecimalFormat;
public class resortDemo
{
    public static void main(String [] args)
    {
        String room;
        int roomCost
        String spa;
        int spaCost;
        String meal;
        int mealCost;
        
        double occupancy;
        double total
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Room Type Deluxe(D) or Executive(E)");
        room = keyboard.next();
     
        System.out.println("Include Spa Y or N");
        spa = keyboard.nextInt();
        
        System.out.println("Include Meal Plan Y or N");
        meal = keyboard.nextInt();
     
        resort r = new resort(room, spa, meal);
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Raise: $" + c.getSalRaise());
        System.out.println("New Salary: $" + c.getSal());
    }
    }