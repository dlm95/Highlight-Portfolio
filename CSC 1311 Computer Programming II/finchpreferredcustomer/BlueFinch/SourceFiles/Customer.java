public class Customer extends Person { 

private int customerNumber; // The Customers Number 
private String eMail; // The Customers E-Maill 
private boolean onMailingList; //Wether the customer is on the mailing list or not 

public Customer() 
{ 
customerNumber = 0; 
eMail = ""; 
} 

public Customer (String n, int pn, String ad, int cn, String em, boolean ml) 
{ 
super(n,pn,ad); 
customerNumber = cn; 
eMail = em; 
onMailingList = ml; 
} 

public int getCustomerNumber() { 
return customerNumber; 
} 

public String geteMail() { 
return eMail; 
} 

public void setCustomerNumber(int customerNumber) { 
this.customerNumber = customerNumber; 
} 

public void seteMail(String eMail) { 
this.eMail = eMail; 
} 

public boolean getMailingList() 
{ 
return onMailingList; 

}
}