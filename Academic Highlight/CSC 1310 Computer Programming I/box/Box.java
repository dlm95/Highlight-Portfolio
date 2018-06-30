
/**
 * Derrick Murphy
 * Dr. Caldwell
 * 9/30/13
 *
 */
public class Box
{
    private double width;       // width of the box
    
    private double height;      // height of the box
    
    private double depth;       // depth of the box
    
    
    
    public double volume()
    
    {
        
        return width * height * depth;
        
    }
    
    public double area()
    {
        return width * height;
    }
    
    
    public void setDim(double w, double h, double d)
    
    {
        
        width = w;
        
        height = h;
        
        depth = d;
        
    }
    
    public double getWidth (double width)
    
    {
        return width;
    }
    
    public double getHeight (double height)
    
    {
        return height;
    }
    
    public double getDepth (double depth)
    
    {
        return depth;
    }
}
