public class csu
{
    private String name;
    private int years;
    private double salary;
    private double raise;
    
    /**
     * constructor
     */
    
    public csu(String n, int y, double s)
    {
        name = n;
        years = y;
        salary = s;
    }
    
    /**
     * return name
     */
    public String getName()
    {
        return name;
    }
        
    public double getRaise()
    {
        double raise;
        
        if (years>=15)
        raise=.15;
        else
        raise=.10;
        
        return raise;
    }
    
    /**
     * return raise
     */
    
    public double getSalRaise()
    {
       double salaryraise;
       
       /*if (years >= 15)
       raise=.15
       else
       raise=.10*/
       
       salaryraise = salary * getRaise();
        
       return salaryraise;
    }
    
    
    /**
     * return final salary
     */
    
    public double getSal()
    {
        salary = salary + getSalRaise();
        
        return salary;
    }
}
        