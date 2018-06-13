
/**
 * add sum of 10 cities and find the average snowfall
 * 
 * @author Derrick Murphy 
 * @version 1/31/14
 */
import java.util.Scanner;
import java.util.ArrayList;
public class snowfall
{
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        double average= 0;
        double sum = 0;
        int aboveavg = 0;
        double highest = 0;
        double lowest = 10;
        String hCity = "";
        String lCity = "";
        
        String[] myCities = new String[]{"Raleigh", "Charlotte", "Greensboro", "Durham", "Winston-Salem", "Fayetteville","High Point", "Chapel Hill", "Wilmington", "Hickory"};
        
        double[] snowfall = new double[]{1.2, 0.4, 0.6, 0.8, 0.9, 2.8, 0.6, 0.8, 2.1, 0.8};
        
        for ( int x = 0; x<=9; x++){
            
            sum = snowfall[x]+sum;
            
        }
        
        for ( int i=0; i<=9; i++){
            if (snowfall[i] > highest){
               
                highest = snowfall[i];
                hCity = myCities[i];
            }
            else if(snowfall[i] < lowest){
                lowest = snowfall[i];
                lCity= myCities[i];
            }
        }
                
        average=sum/10;
        
        for ( int y = 0; y<=9; y++){
            if (snowfall[y]>average)
            {
                aboveavg++;
            }
        }
        
        System.out.println("Average Snowfall = " + average);
        System.out.println("Snowfall above average = " + aboveavg);
        System.out.println(lCity + " had the lowest snowfall with " + lowest + " in of snow.");
        System.out.println(hCity + " had the highest snowfall with " + highest + " in of snow.");
    }
}
        