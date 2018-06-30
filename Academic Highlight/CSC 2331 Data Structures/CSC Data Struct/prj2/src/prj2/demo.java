package prj2;
import java.util.Random;
import java.text.DecimalFormat;
import java.io.*;
/**
 * 
 * 
 * @author Derrick Murphy
 * @version 4/12/16
 * Selection Sort, Bubble Sort, Insertion Sort
 * 
 * swaps :
 * http://www.dreamincode.net/forums/topic/227402-help-finding-number-of-swaps-and-comparisons-of-sorting-algorithm/
 * selection sort code:
 * http://stackoverflow.com/questions/23416400/selection-sorting-java-array
 * 
 * 
 */
public class demo 
	{
	    public static void main(String[] args) throws FileNotFoundException
	    {
	        //Declare the variable and Arrays
	        int arrayLength = 119;
	        double rndmA[] = new double[arrayLength]; //References the Array holding the random
	        DecimalFormat fr = new DecimalFormat("#.00");

	        File txt = new File("outputdata.txt");
	        FileOutputStream dat = new FileOutputStream(txt);
	        PrintStream out = new PrintStream(dat);
	        System.setOut(out);

	        //Create an instance of the Random class.
	        Random rndm = new Random();

	        //Use a for loop to generate the random numbers rndmA will reference.
	        for(int index = 0; index < arrayLength; index++)
	        {
	            rndmA[index] = rndm.nextDouble() *923;   
	        }

	        System.out.println("\nGenerated Numbers Are: \n");
	        int count = 0;
	        for(int index = 0; index < arrayLength; index++)
	        {
	            System.out.print(fr.format(rndmA[index]) + " ");
	            count++;
	            if ( count == 9){
	                System.out.println();
	                count=0;
	            }
	        }    
	        System.out.println();
	        System.out.println();
	        
	        bubblesort(rndmA);
	        selectionsort(rndmA);
	        insertion(rndmA);
	    }

	    public static void display(double[] rray) //Format Array
	    {
	        DecimalFormat fr = new DecimalFormat("#.00");
	        int count =0;
	        for(int index = 0; index < rray.length; index++)
	        {
	            System.out.print(fr.format(rray[index]) + " ");
	            count++;
	            if ( count == 9){
	                System.out.println();
	                count=0;
	            }
	        }
	    }

	    public static void bubblesort(double[] rray) //Bubble Sort
	    {

	        double swap =0;
	        double comp =0;
	        for(int index = 0; index < (120 - 1); index++)

	            for (int d = 0; d < rray.length - index - 1; d++)
	            {
	                comp++;

	                if (rray[d] > rray[d+1]) 
	                {

	                    swap=rray[d];
	                    rray[d]=rray[d+1];
	                    rray[d+1]=swap;
	                    swap++;
	                }
	        }
	        System.out.println("Bubble Sorted List: \n\n");
	        System.out.println("\n\n");
	        display(rray);
	        System.out.println("\n\nSwaps Count: ");
	        System.out.println(swap);
	        System.out.println("\n\nComparison Count: ");
	        System.out.println(comp);
	    }

	    public static void selectionsort(double[] rray) //Selection Sort
	    {
	        double swap =0;
	        double comp =0;
	        for (int i = 0; i < rray.length - 1; i++)
	        {
	            int index = i;

	            for (int k = i + 1; k < rray.length; k++)

	            {
	                comp++;

	                if (rray[k] < rray[index])
	                {

	                    index = k;

	                }      
	            }
	            double sNum = rray[index];
	            rray[index] = rray[i];
	            rray[i] = sNum;
	            swap++;
	        }
	        System.out.println("\n\n");
	        System.out.println("Selection Sorted List: ");
	        System.out.println("\n\n");
	        display(rray);
	        System.out.println("\n\nSwaps Count: ");
	        System.out.println(swap);
	        System.out.println("\n\nComparison Count: ");
	        System.out.println(comp);
	    }

	    public static void insertion(double[] rray) //insertion code
	    {
	        double swap=0;
	        double comp=0;
	        for(int i = 1; i < rray.length; i++)

	        {
	            double tNum = rray[i];
	            int k = i;
	            while (k > 0 && rray[k - 1] > tNum)

	            {
	                rray[k] = rray[k - 1];
	                k--;
	                comp++;    
	            }
	            
	            rray[k] = tNum;
	            swap++;
	        }
	        System.out.println("\n\n");
	        System.out.print("Insertion Sorted List: ");
	        System.out.println("\n\n");
	        System.out.println("\n\n");
	        display(rray);
	        System.out.println("\n\nSwaps Count: ");
	        System.out.println(swap);
	        System.out.println("\n\nComparison Count: ");
	        System.out.println(comp);
	    }
}

