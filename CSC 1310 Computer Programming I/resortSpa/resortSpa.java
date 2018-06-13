
/**
 * Derrick  Murphy
 * Dr. Caldwell
 * Computer Programming I
 * 12/9/13
 */

public class resortSpa
{
   private double suiteP;
   private double spaP;
   private double mealP;
   private double tax;
   
   char suitechar;
   char mealchar;
   char spachar;

 
 
 public void resortSpa()
 {
     suiteP = 0;
     spaP = 0;
     mealP = 0;
     tax = .10;
     

  }
  
 public void setSuiteP(char cs)
 {
     suitechar = cs;
     
     if (suitechar == 'E')
     {
         suiteP = 200;
     }
     else if (suitechar == 'D')
     {
         suiteP = 135;
     }
 }
 
 public void setSpaP(char sc)
 {
     spachar = sc;
     
     if (spachar == 'Y')
     {
         spaP = 20;
     }
     else if (spachar == 'N')
     {
         spaP = 0;
     }
 }
 
 public void setMealP(char mc)
 {
    mealchar = mc;
   
     if (mealchar == 'Y')
     {
         mealP = 60;
     }
     else if (mealchar == 'N')
     {
         mealP = 0;
     }
 }
 
 public double getSuiteP()
 {
     return suiteP;
 }
 
 
 public double getSpaP()
 {
     return spaP;
 }
 
 public double getMealP()
 {
     return mealP;
 }
 
}