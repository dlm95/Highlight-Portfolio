import java.util.Scanner;
public class widfacdemo
{
    public static void main(String [] args)
    { 
        int amount;
        double rate;
        double days;
        
      Scanner keyboard = new Scanner(System.in);
        
      Factory widget = new Factory();
        
      System.out.print("How many widget do you want to produce?\nAmount:");
      amount = keyboard.nextInt();
      widget.setamount(amount);
      
      System.out.println( "Creating " + widget.getamount() + " widgets will take " + widget.getdays() +" days");
    }
}