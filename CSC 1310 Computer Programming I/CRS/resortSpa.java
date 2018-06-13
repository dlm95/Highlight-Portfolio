
/**
 * Derrick  Murphy
 * Dr. Caldwell
 * Computer Programming I
 * 12/9/13
 */
public class resortSpa
{
   private int days;
   private String suite;
   private String spachoice;
   private String mealchoice;
   private double total;
   private String input;
   private double amountafter;
   private double suiteprice = 0;
   private double spa = 0;
   private double mealplan = 0;
   private double tax = .10;
   private double customers = 1;
   private double amountdue;
   private double D = 135;
   private double E = 200;
   char charsuite;
   char charmealchoice;
   char charspachoice;

 
 
 public void resortSpa(int d, double s, double S, double mp, char cs, char sc, char mc)
 {
     charsuite = cs;
     suiteprice = s;
     spa = S;
     charspachoice = sc;
     mealplan = mp;
     charmealchoice = mc;
     days = d;
  }
  
 public void setSuite(double s, char cs)
 {
     suiteprice = s;
     charsuite = cs;
     if (charsuite == 'E')
     {
         suiteprice = 200;
     }
     else if (charsuite == 'D')
     {
         suiteprice = 135;
     }
 }
 
 public void setSpa(double S, char sc)
 {
     spa = S;
     charspachoice = sc; 
     if (charspachoice == 'Y')
     {
         spa = 20;
     }
     else if (charspachoice == 'N')
     {
         spa = 0;
     }
 }
 
 public void setMealplan(double mp, char mc)
 {
     mealplan = mp;
     charmealchoice = mc; 
     if (charmealchoice == 'Y')
     {
         mealplan = 60;
     }
     else if (charmealchoice == 'N')
     {
         mealplan = 0;
     }
 }
 
 public void setDays(int d)
 {
     days = d;
 }
 public int getDays()
 {
     return days; 
 }
 public double getSuite()
 {
     return suiteprice;
 }
 public double getSpa()
 {
     return spa;
 }
 public double getMealplan()
 {
     return mealplan;
 }
}