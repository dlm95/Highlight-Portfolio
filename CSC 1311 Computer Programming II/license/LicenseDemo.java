import java.util.Scanner;

public class LicenseDemo
{
    public static void main(String[] args)
    {
        final int questions = 20;
        char[] answers = new char[questions];
        int [] missedQuestions = null;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your answers to the exam questions. (Turn on Caps Lock)");
                           
        for (int i = 0; i < answers.length; i++)
        {
            System.out.print("Question " + (i + 1) + ": ");
                String input = keyboard.nextLine();
            answers[i] = input.charAt(0);
            
            while (!valid(answers[i]))
            {
                System.out.println("ERROR: Valid answers are " +
                                 "A, B, C, or D.");
                System.out.print("Question " + (i + 1) + ": ");
                    input = keyboard.nextLine();
                    answers[i] = input.charAt(0);
            }
        }
        
        License exam = new License(answers);
        
        missedQuestions = exam.questionsMissed();
        
        System.out.println("Correct answers: " +
                                exam.totalCorrect());
        System.out.println("Incorrect answers: " +
                                exam.totalIncorrect());
                                
        if (exam.passed())
            System.out.println("You passed the exam.");
        else
            System.out.println("You failed the exam.");
            
        if (missedQuestions != null)
        {
            System.out.println("Questions Missed:");
            for (int i = 0; i < missedQuestions.length; i++)
                System.out.print(missedQuestions[i] + " , ");
        }
    }
    
    public static boolean valid(char c)
    {
        boolean status;
        
        if (c == 'A' || c == 'B' || c == 'C' || c == 'D')
            status = true;
        else
            status = false;
            
        return status;
    }
}
