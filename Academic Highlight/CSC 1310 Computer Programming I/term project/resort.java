public class resort
{
    private char room;
    private String spa;
    private String meal;
    private double occupancy;
    private double total;
    
    /**
     * constructor
     */
    
    public resort(char r, String s, String m)
    {
        room = r;
        spa = s;
        meal = m;
    }
    
    /**
     * return name
     */
   /* public char getRoom()
    {
        if (room == D)
        room=Deluxe;
        else if(room==E)
        room=Executive;
        else
        System.out.println("Invalid Option");
        
        return room;
    }
    */
        
    public int getroomCost()
    {
        int roomCost;
        
        if (room=E)
        roomCost=135;
        else if (room==D)
        roomCost=200;
        else
        System.out.println("Invalid Room");
        
        return roomCost;
    }
    
    /**
     * return spa
     */
    
    public int getSpa()
    {
       int spa;
       
       if (spa==Y)
       spa=20;
       else
       spa=0;
       
        
       return spa;
    }
    
    
    /**
     * return plan
     */
    
    public int getPlan()
    {
        int plan;
        
        if (plan==Y)
        plan=60;
        else
        plan=0;
        
        return plan;
    }
    
}
        