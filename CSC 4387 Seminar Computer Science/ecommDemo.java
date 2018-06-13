package ecommerce;

 

import java.util.Random;
import java.util.Scanner;

public class ecommDemo {
    
        public static int randomnum(){
        Random numGen = new Random();
        int rand = Math.abs((50)+numGen.nextInt(100));
        return rand;
    }
    
    public static void main(String [] args)
    {
        boolean run = true;
        while(run){
        char secured;
        double data = randomnum();
        String[] units = {"KB","MB","GB"};
        String unit;
        
        int idx = new Random().nextInt(units.length);
        unit = (units[idx]);
        
        Scanner keyboard = new Scanner(System.in);
        
        //Prompts//
        System.out.println("What is the Connection Type : Transport Layer Security(T) or Secure Socket Layer(S) or Basic(B) ");
        
        secured = keyboard.next().toUpperCase().charAt(0);
        
        ecomm e = new ecomm(secured , data, unit);

        System.out.print(data + " " + unit + " of data was sent over a ");     
        
        e.connection();
        
        e.getbreachTotal();
    }

  }
}
