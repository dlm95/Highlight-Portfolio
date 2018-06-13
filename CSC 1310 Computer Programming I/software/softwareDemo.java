import java.util.Scanner;
import java.text.DecimalFormat;
public class softwareDemo
{
    public static void main(String [] args)
    {
        int units;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter Quantity: ");
        units = keyboard.nextInt();
        software sw = new software(units);
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("Total Cost = $" + (formatter.format(sw.getCost())));
    }
    }