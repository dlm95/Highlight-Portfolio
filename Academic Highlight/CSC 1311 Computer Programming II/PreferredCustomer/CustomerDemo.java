
/**
 * Write a description of class PersonDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// ****************** Tester Class **************** 
public class CustomerDemo { 

public static void main (String [] Args){ 

Customer customer = new Customer("Adam Stanley",818224841,"455 Larkspur Dr.", 1, "adamstanley@gmail.com", true ); 

System.out.println(" Name      Phone Number    Address    Customer Number   Customer E-Mail On ML"); 
System.out.println("__________________... ");
System.out.println(" " + customer.getName() + "  " + customer.getphoneNumber() + "  " 
+ customer.getaddress() + "   " + customer.getCustomerNumber() + "    " + customer.geteMail() + "   " + customer.getMailingList()); 

} 
}
