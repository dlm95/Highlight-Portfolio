import java.util.Scanner;
import java.text.DecimalFormat;
public class shippingDemo
{
    public static void main(String [] args)
    {
        int weight;
        int miles;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Weight of package(in kilograms) = ");
        weight = keyboard.nextInt();
        
        System.out.print("Shipping Distance(in miles) = ");
        miles = keyboard.nextInt();
        shipping ship = new shipping(weight, miles);
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("Shipping Charge " + ship.getRate());
    }
    }