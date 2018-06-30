/**
 * Widget factory
 * Sekuan M
 * Derick M
 */
public class Factory
{
private int amount; //widgettotal is the total amount of widgets needed
private double rate; //rate of widgets per hours
private double days; // days in hours


 public void setamount(int w)
  {
     amount = w;
    }
   
 
 public void setrate(double r)
 {
     rate = r;
    }
 
 public void setdays(double d)
 {
     days = d;
    }
    
public int getamount()
 {
     return amount;
    }
    
 public double getrate()
 {
     return rate;
    }
    
 public double getdays()
 {
     return (amount/160);
    }
}