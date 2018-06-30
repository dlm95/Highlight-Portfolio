
/**
 * Tokenize a string
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trimDemo
{
    public static void main (String[] args)
    {
        String data = "one and two and three and four and five ";
        
        String[] tokens = data.split(" and ");
        
        for (String s : tokens)
        System.out.println(s);
        
    }
}
