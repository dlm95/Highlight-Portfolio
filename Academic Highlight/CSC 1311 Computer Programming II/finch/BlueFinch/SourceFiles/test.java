// Needs a package declaration to move to another folder
import java.awt.Color;
 
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by: Derrick Murphy,Adrian Williams,Josiah Gilbert
 * Date:4/14/14
 */

public class test
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      
      // Executing the spiral in and out, and also setting the LED to go from blue to red
	  for(int i = 0; i < 255; i+=5)  {
                // Set LED to start at blue and fade to red
	  	myFinch.setLED(i, 0, 255-i);
	  	
	  }
	  myFinch.setWheelVelocities(0, 255, 2000);
	  myFinch.saySomething("Im Ready to go!");
	  
      while(!myFinch.isBeakDown()) {
          
        if(myFinch.isObstacleLeftSide()) {
            myFinch.setLED(255,0,0);
            myFinch.buzz(880, 500);
            myFinch.playClip("bicycle_bell.wav");
            myFinch.setWheelVelocities(-255,-255,1000);
            myFinch.setWheelVelocities(155,-255,450);
        }
        else if(myFinch.isObstacleRightSide()) {
            myFinch.setLED(255,0,0);
            myFinch.buzz(880, 500);
            myFinch.playClip("bicycle_bell.wav");
            myFinch.setWheelVelocities(-255,-255,1000);
            myFinch.setWheelVelocities(-255, 155, 450);
            
        }
        else {
            myFinch.setWheelVelocities(255,255);
            myFinch.setLED(0,255,0);
            myFinch.playClip("ice_cream_truck.wav");
        }
       }

      myFinch.quit();
      System.exit(0);
      }
   }