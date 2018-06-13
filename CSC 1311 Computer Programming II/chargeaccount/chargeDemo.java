import java.util.Scanner;
import java.text.NumberFormat;
public class chargeDemo
{
    public static void main(String [] args)
    {
        double previous;
        double additional;
        double interest;
        double newBalance;
        double minPay;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter Previous Balance: $");
        previous = keyboard.nextDouble();
        
        System.out.print("Enter Additional Charges: $");
        additional = keyboard.nextDouble();
        
        charge chrg = new charge(previous, additional);
        
        NumberFormat cformat = NumberFormat.getCurrencyInstance();
        
        System.out.println("\nCS Card International Statement");
        System.out.println("===============================\n");
        System.out.println("Previous Balance:           " + cformat.format(previous));
        System.out.println("Additional Charges:         " + cformat.format(additional));
        System.out.println("Interest:                   " + cformat.format(chrg.getInterest()));
        System.out.println("\nNew Balance:                " + cformat.format(chrg.getnewBalance()));
        System.out.println("\nMinimum Payment:            " + cformat.format(chrg.getminPay()));
        
    }
}
