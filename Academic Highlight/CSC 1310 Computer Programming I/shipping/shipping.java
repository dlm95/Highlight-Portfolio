public class shipping
{
    private int weight;
    private int miles;
    private double rate;
    
    /**
     * constructor
     */
    
    public shipping(int w, int m)
    {
        weight = w;
        miles = m;
    }
    
    /**
     * return rate
     */
    
    public double getRate()
    {
        if (miles <= 499)
        {
            miles=500;
        }

        if (weight <= 2)
        rate = (1.10 * Math.ceil(miles / 500));
        else if (weight > 2 && weight <= 6)
        rate = (2.20 * Math.ceil(miles / 500));
        else if (weight > 6 && weight <= 10)
        rate = (3.70 * Math.ceil(miles / 500));
        else
        rate = (4.80 * Math.ceil(miles / 500));
        
        return rate;
    }
    
    /**
     * return weight
     */
    
    public int getWeight()
    {
        return weight;
    }
    
    /**
     * return miles
     */
    
    public int getMiles()
    {
        return miles;
    }
}