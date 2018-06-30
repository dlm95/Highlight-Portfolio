public class charge
{
    private double previous;
    private double additional;
    private double interest;
    private double newBalance;
    private double minPay;

    public charge(double p, double a)
    {
        previous = p;
        additional = a;
        interest = .02;
    }

    public double getInterest()
    {
        interest = (previous+additional)*interest;
        
        return interest;
    }
    
    public double getnewBalance()
    {
         newBalance = previous+additional+interest;
         
         return newBalance;
        }
        
    public double getminPay()
    {
        if(previous+additional < 50)
           {
               minPay = previous+additional;
            } 
            else if(newBalance >= 50 && newBalance<= 300 )
            {
                minPay = 50;
            }
            else
            {
                minPay = newBalance*.2;
            }
            
            return minPay;
    }
}
