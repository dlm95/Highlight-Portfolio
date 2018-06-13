
/**
 * Television
 * 
 * Derrick Murphy 
 * September 27, 2013
 */
public class Television
{
    //variables 
    private String MANUFACTURER; //manufacturer
    private int SCREEN_SIZE; //screen size
    private boolean powerOn; //power control
    private int channel; //channel 
    private int volume; //volume 


     /**
     * Constructor for objects of class Televison
     */
    
   
    public Television(String brand, int size)
    {
        //Manufacturer brand and screen size
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        //powerOn, volume, and channel are initialized also
        powerOn = false;
        volume = 17;
        channel = 2;
    }
 //accessor methods that return a value from the corresponding field.
    public int getVolume()
    {
        return volume;
    }
    
    public int getChannel()
    {
        return channel;
    }
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    public void setChannel(int station)
    {
        channel = station;
    }
    
    public void power()
    {
    powerOn = !powerOn;
    }
    // changes the volume
    public void increaseVolume()
    {
        volume += 1;
    }
    public void decreaseVolume()
    {
        volume -= 1;
    }
    
    }
