import java.util.Scanner;
public class test1Demo
{
    public static void main(String [] args)
    {
        String sentence="I am happy when I attend my Computer Programming II class!";
        char target;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(sentence);
        System.out.println("What letter would you like to count?");
        target = keyboard.next().charAt(0);
        
        test1 tst = new test1(target,sentence);
        
        System.out.println("Target character = " + target);
        
        System.out.println("'" + target + "'" + " was found " + tst.getFound() + " times in the sentence.");
        
        
}
}
