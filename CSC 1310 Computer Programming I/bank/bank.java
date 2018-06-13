public class bank
{
    private double balance;
    public int checks;
    private int fine;
    private int charge;
    private double fee;
    
    /**
     * constructor
     */
    
    public bank(double b, int c)
    {
        balance = b;
        checks = c;
        fine = 0;
        charge = 10;
    }
    
    /**
     * is balance < 400
     */
    public int getFine()
    {
        if ( balance<400)
        fine=15;
        
        return fine;
    }
    
    /**
     * return check fees
     */
    
    public double getFee()
    {
       double fee;
        
        if (checks < 20)
        fee = checks * .10;
        else if (checks >= 20 && checks <= 39)
        fee = checks * .08;
        else if (checks >= 40 && checks <= 59)
        fee = checks * .06;
        else
        fee = checks * .04;
        

       return fee;
    }
    
    
    /**
     * return final balance
     */
    
    public double getBalance()
    {
        balance = balance - getFine() - getFee() - charge;
        
        return balance;
    }
}
        