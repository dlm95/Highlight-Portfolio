
/**
 * The purpose of this class is to model a television
 * 
 * Derrick Murphy 
 * September 27, 2013
 */
public class Car
{
    //variables
    private int yearModel; //Model
    private String make; //make of vehicle
    private int speed; //speed of car


     /**
     * Constructor for objects of class Car
     */
    
   
    public Car(int yearM, String maK)
    {
        //Car model, make, speed
        yearModel = yearM;
        make = maK;
        speed = 0;
    }
    
    public void setyearModel(int yearM)
    {
        yearModel = yearM;
    }
    
    public void setmake(String maK)
    {
        make = maK;
    }
    
    //accessor methods that return a value from the corresponding field
    
    public int getyearModel()
    {
       yearModel = yearM;
    }
    
     public String getmake()
    {
       make = maK;
    }

    // change the speed
    public int accerlate()
    {
        speed +=5;
    }
    public int brake()
    {
        speed -= 5;
    }
    
}
