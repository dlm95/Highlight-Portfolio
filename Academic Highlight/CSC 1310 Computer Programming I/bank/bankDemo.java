import java.util.Scanner;
import java.text.DecimalFormat;
public class bankDemo
{
    public static void main(String [] args)
    {
        double balance;
        int checks;

        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Current Balance: ");
        balance = keyboard.nextDouble();
        
        System.out.print("Number of Checks Written: ");
        checks = keyboard.nextInt();
     
        
        bank bk = new bank(balance, checks);
        
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("Checks Written = " + bk.checks);
        System.out.println("Bank Service Fees = $" + (balance-bk.getBalance()));
        System.out.println("Remaining Balance = $" + bk.getBalance());
    }
    }