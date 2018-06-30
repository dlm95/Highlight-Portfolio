
public class Person
{
    private String name;
    private String address;
    private String phone;
    
    public Person(String n, String a, String p)
    {
        name = n;
        address = a;
        phone = p;
    }
    
    public Person()
    {
        name = "";
        address = "";
        phone = "";
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setAddress(String a)
    {
        address = a;
    }
    
    public void setPhone(String p)
    {
        phone = p;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getTelephone()
    {
        return phone;
    }
        
    
}
