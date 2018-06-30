
/**
 * THis program classifies a component in a sentence as a digit, letter, white space, lower case, or upper case
 * 
 * @author Derrick Murphy 
 * @version March 21, 2014
 */
import java.util.Scanner;
public class quizDemo
{
    public static void main (String args[])
    {
    Scanner keyboard = new Scanner(System.in);
    
    String sentence;
    System.out.println("Enter a sentnce using digits, letters; lower ,and upper case.");
    sentence=keyboard.nextLine();
    
    quiz qz = new quiz(sentence);
    
    System.out.println("\n\n");
    System.out.println(sentence);
    System.out.println("\n");
    qz.digits();
    qz.letters();
    qz.upper();
    qz.lower();
    
}
}
