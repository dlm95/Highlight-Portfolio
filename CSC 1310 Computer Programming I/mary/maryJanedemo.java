import java.util.Scanner;
public class maryJanedemo
{
    public static void main(String [] args)
    {
        int price;
        int grams;
        
        Scanner keyboard = new Scanner(System.in);
        
        maryJane mj = new maryJane();
        
        System.out.print("Amount Spent: ");
        price = keyboard.nextInt();
        mj.setPrice(price);
        
        System.out.print("Grams Recieved: ");
        grams = keyboard.nextInt();
        mj.setGrams(grams);
        
        System.out.println("You spent $" + price);
        
        System.out.println("In order to reup you must sale " + mj.getReup()+ " grams");
        
        System.out.println("That leaves you with " + mj.getLeft() + " grams to profit from");
        
        System.out.println("Your maximum profit could be $" + mj.getpotential());
    }
}