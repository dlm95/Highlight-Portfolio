
/**
 * Counts vowels and consonants
 * 
 * Derrick Murphy 
 * 3/18/1995
 */

import java.util.Scanner;
public class vwlsDemo
{
        public static void main (String args[]) 
        {
                Scanner keyboard = new Scanner(System.in);
                
                String sentence;
                
                System.out.print("Enter A String: ");
                sentence = keyboard.nextLine();
                sentence = sentence.toLowerCase();
                
                vwls v = new vwls(sentence);
                
                v.count();
                
                //System.out.println("String = " + sentence);
                System.out.println("\nvowels found = " + v.vowels());
                System.out.println("consonants found = " + v.consonants());

        }
        
}
