public class software
{
    private int units;
    
    /**
     * constructor accepts number of units sold
     */
    
    public software(int u)
    {
        units = u;
    }
    
    /**
     * getUnits returns the units
     */
    
    public int getUnits()
    {
        return units;
    }
    
    /**
     * getCost returns final cost
     */
    
    public double getCost()
    {
        double cost;
        
        if (units >= 10 && units <= 19)
        cost = (units * 99)-(units * 99 * .20);
        else if (units >= 20 && units <= 49)
        cost = (units * 99)-(units * 99 * .30);
        else if (units >= 50 && units <= 99)
        cost = (units * 99)-(units * 99 * .40);
        else if(units >= 100)
        cost = (units * 99)-(units * 99 * .50);
        else
        cost = units * 99;
       
        
        return cost;
    }
}
        