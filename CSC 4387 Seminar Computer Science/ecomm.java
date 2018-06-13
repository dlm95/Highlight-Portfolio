package ecommerce;

 
import java.util.Random;


public class ecomm {
    private String unit;
    private char connect;
    private double data;
    private double breachTotal;
    String connection;
    
    /**constructor**/
    
    public ecomm(char c, double d, String u)
    {
        connect = c;
        data = d;
        unit = u;
        
    }
    
    public static double randomnumBasic(){
        
        Random random = new Random();
        
        double min =.8,max = .4;
        
        double rand = min + (max - min) * random.nextDouble();
        
        //System.out.println(rand);
        
        return rand;
       
       }
       
    public static double randomnumSSL(){
        
        Random random = new Random();
        
        double min =.28,max = .15;
        
        double rand = min + (max - min) * random.nextDouble();
        
        //System.out.println(rand);
        
        return rand;
       
       }   
    
    public static double randomnumTLS(){
        
        Random random = new Random();
        
        double min =.1,max = .02;
        
        double rand = min + (max - min) * random.nextDouble();
        
        //System.out.println(rand);
        
        return rand;
       
       }
       
    public void getbreachTotal()
    {
       if (connect == 'B')
            breachTotal = data*randomnumBasic();
            else
            if (connect=='S')
            breachTotal = data*randomnumSSL();
            else
            if(connect=='T')
            breachTotal = data*randomnumTLS();
        
    
        System.out.println("Data breached = " + breachTotal + " " + unit + " of " + data + " " + unit+"\n");
    }
    
    public void samplesets()
    {
        
            System.out.println("basic = " + data*randomnumBasic());
            System.out.println("ssl = " + data*randomnumSSL());
            System.out.println("tls = " + data*randomnumTLS());
        }
    
    
    public void connection()
    {
        
        if (connect == 'S')
            connection="Secure Socket Layer";
            else
            if(connect=='B')
            connection="Basic";
            else
            if(connect=='T')
            connection="Transport Layer Security";
        
        System.out.print(connection + " connection\n");
        
    }
    
    /**
     public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    **/
}
