import java.util.Scanner;
public class schooldemo
{
    public static void main(String [] args)
    { 
        int score1;
        int score2;
        int total;
        
        
      Scanner keyboard = new Scanner(System.in);
        
      School room = new School();
        
      System.out.print("Score One: ");
      score1 = keyboard.nextInt();
      room.setScore1(score1);
      
      System.out.print("Score Two: ");
      score2 = keyboard.nextInt();
      room.setScore2(score2);
      
      System.out.println("Total: " + room.getTotal());
      
      System.out.println( "Average = " + room.getaverage() );
    }
}