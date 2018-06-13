public class maryJane
{
    private int grams;
    private int price;
    private double reup;
    private int Left;
    private int potential;
   
    
    public void setGrams(int g)
    {
        grams = g;
    }
    
    public void setPrice(int p)
    {
        price = p;
    }
    /**/
    public int getGrams()
    {
        return grams;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double getReup()
    {
        return price/20;
    }
    
    public int getLeft()
    {
        return grams -(price/20);
    }
    
    public int getpotential()
    {
        return (grams - (price/20)) * 20;
    }
}