public class vwls
{
   String sentence;
   int vowels = 0;
   int consonants = 0;
   int skip = 0;
   
    public vwls(String s)
    {
        sentence = s;
        
    }
    
    public void count()
        {
            char[] letter = sentence.toCharArray();
            for (int i = 0; i < letter.length; i++)
                {
                   if (letter[i] == 'a' || letter[i] == 'e' || letter[i] == 'i' || letter[i] == 'o' || letter[i] == 'u')
                    {
                        vowels++;
                    }
                    else if(letter[i] == ' ')
                    {
                        skip++;
                    }
                    else
                    {
                        consonants++;
                    }
                }
        }

    public int vowels()
    {
        return vowels;
    }
    
    public int consonants()
    {
        return consonants;
    }
}
