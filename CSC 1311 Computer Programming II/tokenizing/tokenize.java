import java.util.StringTokenizer;
public class tokenize
{
    private String month, day, year;

   
    public tokenize(String date)
    {
        StringTokenizer token = new StringTokenizer(date,"/", false);
        
        month = token.nextToken();
        day = token.nextToken();
        year = token.nextToken();
    }

   
    public String getMonth()
    {
        return month;
    }
    
    public String getDay()
    {
        return day;
    }
    
    public String getYear()
    {
        return year;
    }
}
