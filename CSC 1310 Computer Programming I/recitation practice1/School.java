/**
 * School factory
 * 
 * Derick M
 */
public class School
{
private int score1; 
private int score2; 
private float average;
private int total;

 public void setScore1(int one)
  {
     score1 = one;
    }
   
 
 public void setScore2(int two)
 {
     score2 = two;
    }
    
public float getaverage()
 {
     return (score1 + score2)/2;
    }
    
public int getTotal()
 {
    return score1 + score2;
   }

}