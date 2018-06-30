
/**
 * Tokenize a string
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tokenizeDemo
{
    public static void main (String[] args)
    {
        String date = "02/28/2014";
        
        tokenize tk = new tokenize(date);
        
        System.out.println("Date : " + date);
        System.out.println("The month is " + tk.getMonth());
        System.out.println("The day is " + tk.getDay());
        System.out.println("The year is " + tk.getYear()); 
    }
}
