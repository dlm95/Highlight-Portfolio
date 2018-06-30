public class License
{

    private char[] correct = { 'B', 'D', 'A', 'A',
                               'C', 'A', 'B', 'A',
                               'C', 'D', 'B', 'C',
                               'D', 'A', 'D', 'C',
                               'C', 'B', 'D', 'A' };
                               
    private char[] student;
    private int[] missed;
    private int numCorrect = 0;
    private int numIncorrect = 0;
    
    public License(char[] s)
    {
        
        student = new char[s.length];
        
        for (int i = 0; i < s.length; i++)
            student[i] = s[i];
            
            
        gradeExam();
    }
    
    private void gradeExam()
    {
        for (int i = 0; i < student.length; i++)
        {
            if (student[i] == correct[i])
                numCorrect++;
            else
                numIncorrect++;
        }
        makeMissedArray();
    }
    
    private void makeMissedArray()
    {
        int m = 0;
        
        if (numIncorrect > 0)
        {
            missed = new int[numIncorrect];
            for (int i = 0; i < student.length; i++)
            {
                if (student[i] != correct[i])
                {
                    missed[m] = (i + 1);
                    m++;
                }
            }
        }
    }
    
    public boolean passed()
    {
        boolean status;
        
        if (numCorrect >= 15)
            status = true;
        else
            status = false;
            
            return status;
    }
    
    public int totalCorrect()
    {
        return numCorrect;
    }
    
    public int totalIncorrect()
    {
        return numIncorrect;
    }
    
    public int[] questionsMissed()
    {
        int[] temp = null;
        
        if (missed != null)
        {
            temp = new int[missed.length];
            for (int i = 0; i < missed.length; i++)
                temp[i] = missed[i];
        }
        
        return temp;
    }
}