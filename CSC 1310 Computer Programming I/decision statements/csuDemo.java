import java.util.Scanner;
import java.text.DecimalFormat;
public class csuDemo
{
    public static void main(String [] args)
    {
        String name;
        int years;
        double salary;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = keyboard.next();
        
        System.out.println("Number of years worked?");
        years = keyboard.nextInt();
        
        System.out.println("What is your current salary?");
        salary = keyboard.nextInt();
     
        csu c = new csu(name, years, salary);
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Raise: $" + c.getSalRaise());
        System.out.println("New Salary: $" + c.getSal());
    }
    }