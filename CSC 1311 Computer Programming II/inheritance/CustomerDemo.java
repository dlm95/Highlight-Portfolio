
/**
 * @author Derrick Murphy 
 * @version 4/23/14
 */
public class CustomerDemo
{
    public static void main(String [] args)
    {
        Customer cst = new Customer("Derrick Murphy", "123 A St", "202-555-123", "100-ABC", true);
        
        System.out.println("Name: " + cst.getName());
        System.out.println("Telephone: " + cst.getTelephone());
        System.out.println("Address: " + cst.getAddress());
        System.out.println("Customer Number: " + cst.getcNum());
        
        
        if (cst.getMailingList())
            System.out.println("Mailing List: YES");
        else
            System.out.println("MailingList: NO");
        }
}
