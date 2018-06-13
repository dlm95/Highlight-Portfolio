import java.io.*;
import java.util.StringTokenizer;

/**
 * Derrick Murphy
 * Professor Caldwell
 * 
 * Proficiency Exam : Robo Competition
 * 
 * March 30, 2014
 */

public class RoboComp
{
    public static void main(String[] args) throws IOException
    {
       
        int num_comp = 20;
        
        String[] data = new String[num_comp];
        String[] name = new String[num_comp];
        int[] category = new int[num_comp];
        int[] rnd1 = new int[num_comp];
        int[] rnd2 = new int[num_comp];
        int[] rnd3 = new int[num_comp];
 
        int oneCount = 0;
        int twoCount = 0;
        
        FileReader freader = new FileReader("README.TXT");
        BufferedReader inputFile = new BufferedReader(freader);
        
        BubbleSort demo = new BubbleSort();
        
        
        for (int index = 0; index < num_comp; index++)
        {
            data[index] = inputFile.readLine();
        }
        
        inputFile.close();
        
        for(int x = 0; x < num_comp; x++) {
            StringTokenizer strTokenizer = new StringTokenizer (data[x], ",");
            name[x] = strTokenizer.nextToken();
            category[x] = Integer.parseInt(strTokenizer.nextToken());
            rnd1[x] = Integer.parseInt(strTokenizer.nextToken());
            rnd2[x] = Integer.parseInt(strTokenizer.nextToken());
            rnd3[x] = Integer.parseInt(strTokenizer.nextToken());
        }
        
        System.out.println("#######################################");
        System.out.println("Robot League Competition Results");
        System.out.println("#######################################\n");
        System.out.println("Task 1");
        System.out.println("***************************************\n");
        System.out.println("Name:" + "        "  + "Category:" + "    " + "  Round 1: " + "   " + "Round 2: " + "   " + "Round 3:");
        
        for(int index = 0; index < name.length; index++) {
            System.out.println(name[index] + "\t  " + category[index] + "\t      " + rnd1[index] + "\t   " + rnd2[index] + "\t      " + rnd3[index]);
        }
        
        double[] avg = new double[num_comp];
        
        for(int index = 0; index < avg.length; index++){
            avg[index] = (rnd1[index] + rnd2[index] + rnd3[index])/3;
        }
        
        System.out.println("\nTask 2");
        System.out.println("**************************************");
        System.out.println("All Eligible Students:");
        System.out.println("Name:" + "      " + "Category:" + "  " + "Average:");
        
        demo.sort(name,category,avg);
        
        for(int index = 0;  index < num_comp; index++ ) {
            if(avg[index] >= 85) {
                System.out.println(name[index] + "\t" + category[index] + "\t" + avg[index]);
            }
        }
        
         System.out.println("Task 3");
         System.out.println("*********************************************************");
         System.out.println("Category 1 Eligible Students:");
         System.out.println("Name:");
         
         
         for(int index = 0;  index < num_comp; index++ ) {
                if(avg[index] >= 85 && category[index] == 1) {
                    System.out.println(name[index]);
                    oneCount++;
                }
            }
            
         System.out.println("\nTask 4");
         System.out.println("*********************************************************");
         System.out.println("Category 2 Eligible Students");
         System.out.println("Name:");
      
         
         for(int index = 0;  index < num_comp; index++ ) {
                if(avg[index] >= 85 && category[index] == 2) {
                    System.out.println(name[index]);
                    twoCount++;
                }
            }
            
         System.out.println("\nTask 5");
         System.out.println("*********************************************************");
         
         System.out.println("There are " + oneCount + " Eligible Students in Category 1:");
         
         System.out.println("\nTask 6");
         System.out.println("*********************************************************");
         System.out.println("There are " + twoCount + " Eligible Students in Category 2:");
    }
    }
