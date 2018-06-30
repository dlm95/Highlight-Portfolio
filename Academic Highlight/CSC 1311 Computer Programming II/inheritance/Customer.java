public class Customer extends Person
{
    private String cNum;
    private boolean mList;
    
    public Customer()
    {
        super();
        cNum = "";
        mList = false;
    }
    
    public Customer(String n, String p, String a, String cn, boolean ml)
    {
        super(n, p, a);
        cNum = cn;
        mList = ml;
    }
    
    public void setcNum(String cNum)
    {
        this.cNum = cNum;
    }
    
    public String getcNum()
    {
        return cNum;
    }
    
    public boolean getMailingList()
    {
        return mList;
    }
}
