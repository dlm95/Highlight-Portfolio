public class PreferredCustomer extends Customer
{
    
    private double discountLevel;
    private double purchases;

   
    public PreferredCustomer()
    {
      super();
      discountLevel = 0.0;
      purchases = 0.0;
    }
    
    public PreferredCustomer(String n, int pn, String ad, int cn, String em, boolean ml, double p, double dl)
    {
       super (n,pn,ad,cn,em,ml);
       purchases = p;
       discountLevel = dl;
    }
    
    public double getPurchases()
    {
        return purchases;
    }
    
    public double getDiscountLevel()
    {
        return discountLevel;
        
    }
    
    public double getPurchaseAmount()
    {
        purchases = purchases * discountLevel;
        return purchases;
    }
   
}