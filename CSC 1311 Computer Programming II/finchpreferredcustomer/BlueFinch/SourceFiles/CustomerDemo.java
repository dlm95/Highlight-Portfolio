public class CustomerDemo { 

public static void main (String [] Args){ 

Customer customer = new Customer("Derrick Murphy",202555123,"456 A st", 1, "csc@wssu.edu", true ); 

System.out.println(" Name      Phone Number    Address    Customer Number   Customer E-Mail On ML"); 
System.out.println("__________________... ");
System.out.println(" " + customer.getName() + "  " + customer.getphoneNumber() + "  " 
+ customer.getaddress() + "   " + customer.getCustomerNumber() + "    " + customer.geteMail() + "   " + customer.getMailingList()); 

} 
}