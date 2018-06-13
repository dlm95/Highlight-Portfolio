public class Person { 

private String Name; 
private int phoneNumber; 
private String address;

public Person() 
{ 
Name=""; 
phoneNumber = 0; 
address = ""; 
} 

public Person (String n, int pn, String ad) 
{ 
Name = n; 
phoneNumber = pn; 
address = ad; 
} 
public void setName(String n) 
{ 
Name = n; 
} 
public void setidnumber(int pn) 
{ 
phoneNumber = pn; 
} 
public void setdepartmen(String ad) 
{ 
address = ad; 
} 
public String getName() 
{ 
return Name; 
} 
public int getphoneNumber() 
{ 
return phoneNumber; 
} 
public String getaddress() 
{ 
return address; 
} 
} 

