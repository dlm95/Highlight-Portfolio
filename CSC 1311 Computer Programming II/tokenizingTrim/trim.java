import java.util.StringTokenizer;
public class trim
{
    private String data, trimmed;

   
    public trim(String d)
    {
        data = d;
    }

   
    public String getData()
    {
        StringTokenizer token = new StringTokenizer(data.trim(),";");
        
        while(token.hasMoreTokens()){
            System.out.println("#" + token.nextToken() + "#");
        }
        return trimmed;
    }
}
