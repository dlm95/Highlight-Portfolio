
/**
 * Derrick Murphy
 * Dr. Caldwell 
 * 9/30/13
 * 
 * 
 */

import java.util.Scanner;

public class BoxDemo
{   
   public static void main(String args[])
   
        {
            Box mybox1 = new Box();
            Box mybox2 = new Box();
            
            double vol;     //volume of the box
            
            double area;    //area of the box
            
            double width;   // width of the box
            
            double height;  // height of the box
            
            double depth;    // depth of the box
            
            
           
            
            
            
            Scanner keyboard=new Scanner(System.in);
           
            
            mybox1.setDim(10,20,15);
            
            mybox2.setDim(3,6,9);
            
            System.out.println("What is the width? ");
            
            width= keyboard.nextDouble();
            
            System.out.println(" What is the height? ");
            
            height= keyboard.nextDouble();
            
            System.out.println( " What is the depth? ");
            
            depth= keyboard.nextDouble();
            
            
            
          
            area = mybox1.area();
            
            System.out.println( "Area is " + area);
            
            area = mybox2.area();
            
            System.out.println( "Area is " + area);
            
            vol = mybox1.volume();
            
            System.out.println("Volume is " + vol);
            
            vol = mybox2.volume();
            
            System.out.println("Volume is " + vol);
            
            
            width = mybox1.getWidth(width);
            
            System.out.println("Width is " + width);
            
            width = mybox2.getWidth(width);
            
            System.out.println("Width is " + width);
            
            height = mybox1.getHeight(height);
            
            System.out.println("Height is " + height);
            
            height = mybox2.getHeight(height);
            
            System.out.println("Height is " + height);
            
            depth = mybox1.getDepth(depth);
            
            System.out.println("Depth is " + depth);
            
            depth = mybox2.getDepth(depth);
            
            System.out.println("Depth is " + depth);

        }
    }
            