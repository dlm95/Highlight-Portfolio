public class test1
{
    private char target;
    private int count;
    private String sentence;
    
    public test1(char t, String s)
    {
        target = t;
        sentence = s;
    }
    
    public int getFound()
    {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target) {
                count++;
            }
        }
            return count;
    }
}

