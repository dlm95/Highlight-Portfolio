
/**
 * Write a description of class eCommDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eCommDemo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class eCommDemo
     */
    public eCommDemo()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     Random Number Generator 
     */
    public int sampleMethod(int y)
    {
        Random numGen = new Random();
		int rand = Math.abs((50)+numGen.nextInt(100));
		
		return rand;
    }
}
