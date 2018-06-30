
/**
 * Derrick Murphy
 * Professor Caldwell
 * CSC 1311
 * 4/4/14
 * 
 * Sample Proficiency Exam #2
 */
import java.io.*;
import java.util.StringTokenizer;
import java.text.DecimalFormat;
public class proDEMO
{
    public static void main(String[] args) throws IOException
    {
    DecimalFormat fr = new DecimalFormat("$##,##0.00");
    
    int num_fac = 18;
    
    String[] marchData = new String[num_fac];
    String[] name = new String[num_fac];
    String[] department = new String[num_fac];
    int[] miles = new int[num_fac];
    double[] apm = new double[num_fac];
    double[] pledge_amounts = new double[num_fac];
    
    // select file to read
    FileReader freader = new FileReader("README.TXT");
    BufferedReader inputFile = new BufferedReader(freader);
    
    // Read data from file
    for(int index = 0; index < num_fac; index++)
    {
        marchData[index] = inputFile.readLine();
    }
    inputFile.close();
    
    // Tokenize data
    for(int index = 0; index < marchData.length; index++)
    {
        StringTokenizer strTokenizer = new StringTokenizer(marchData[index],",");
        {
            name[index] = strTokenizer.nextToken();
            department[index] = strTokenizer.nextToken();
            miles[index] = Integer.parseInt(strTokenizer.nextToken());
            apm[index] = Double.parseDouble(strTokenizer.nextToken());
        }
    }
    
    //Display Data
    System.out.println("Task 1");
    System.out.println("Name" + "\t\tDepartment" + "\t Miles Walked" + "\tPledged Amount Per Mile");
    for(int index = 0; index < name.length; index++)
    {
        System.out.println(name[index] + "\t    " + department[index] + "\t\t     " + miles[index] + "\t\t   " + fr.format(apm[index]));
    }
    
    //compute total amount of pledges
    for(int index = 0; index <miles.length; index++)
    {
        double total_pledges = (miles[index]*apm[index]);
        pledge_amounts[index] = total_pledges;
    }
    
    pro po = new pro();
    System.out.println("\nTask 2");
    System.out.println("Name" + "\t\t   Total Pledges");
    po.sort(pledge_amounts,name,department,miles,apm);

    
    System.out.println("\nTask 3");
    System.out.println("Participants with 15+ Miles Walked");
    System.out.println("Name(s):");
    for(int index = 0; index <miles.length; index++)
    {
        if(miles[index]>=15)
        {
            System.out.println(name[index]);
        }
    }
    
    
    System.out.println("\nTask 4");
    po.tot_avg(pledge_amounts);
    
    System.out.println("\nTask 5");
    po.csc(department,pledge_amounts);
    po.mat(department,pledge_amounts);
    po.eng(department,pledge_amounts);
    
    for(int index = 0; index <miles.length; index++)
    {
        double total_pledges = (miles[index]*apm[index]);
        pledge_amounts[index] = total_pledges;
    }
    
    System.out.println("\nTask 6");
    po.winner();
}
    
}

