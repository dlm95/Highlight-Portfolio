
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
        String data = "    one;two;three   ";
        /**StringTokenizer token = new StringTokenizer(data.trim(),";");
        while(token.hasMoreTokens()){
            System.out.println("#" + token.nextToken() + "#");
        }**/
        trim tm = new trim(data);
        
        System.out.println(tm.getData());
    }
}
