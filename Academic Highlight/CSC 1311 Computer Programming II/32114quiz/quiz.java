public class quiz
{
   String sentence;
   char[] sentArray;
   int[] digits;
   char[] letters;
   char[] lower;
   char[] upper;
   int whitespace = 0;
   
    public quiz(String s)
    {
        sentence = s;
        
    }
    
    public void digits()
        {
            //char[] sentArray = sentence.toCharArray();
            for (int i = 0; i < sentence.length(); i++)
                {
                    char x = sentence.charAt(i);
                    
                   if (Character.isDigit(x))
                    {
                        System.out.print(x + ", ");
                    }
                }
                System.out.println(" are digits in the string.");
        }
        
        public void letters()
        {
            //char[] sentArray = sentence.toCharArray();
            for (int i = 0; i < sentence.length(); i++)
                {
                    char x = sentence.charAt(i);
                    
                   if (Character.isLetter(x))
                    {
                        System.out.print(x + ", ");
                        
                    }
                }
                System.out.println(" are letters in the string.");
        }
        
            public void upper()
        {
            //char[] sentArray = sentence.toCharArray();
            for (int i = 0; i < sentence.length(); i++)
                {
                    char x = sentence.charAt(i);
                    
                   if (Character.isUpperCase(x))
                    {
                        System.out.print(x + ", ");
                        
                    }
                   
                }
                System.out.println(" are upper case letters in the string.");
        }
        
            public void lower()
        {
            //char[] sentArray = sentence.toCharArray();
            for (int i = 0; i < sentence.length(); i++)
                {
                    char x = sentence.charAt(i);
                    
                   if (Character.isLowerCase(x))
                    {
                        System.out.print(x + ", ");
                        
                    }
                   
                }
                System.out.println(" are lower case letters in the string.");
        }

   
}
    
    
