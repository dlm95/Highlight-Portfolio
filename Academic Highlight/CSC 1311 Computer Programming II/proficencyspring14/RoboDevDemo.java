import java.io.*;
import java.util.StringTokenizer;
/**
 * Derrick Murphy
 * Professor Caldwell
 * Proficiency Exam : Spring 2014
 */

public class RoboDevDemo
{
    public static void main(String[] args) throws IOException
    {
        int num_students = 12;
        
        String[] data = new String[num_students];
        String[] name = new String[num_students];
        double[] GPA = new double[num_students];
        int[] hrs = new int[num_students];
        double[] rating = new double[num_students];
        
        RoboDev rdc = new RoboDev(name , GPA , hrs , rating);
        
        FileReader freader = new FileReader("README.TXT");
        BufferedReader inputFile = new BufferedReader(freader);
        
        for(int x = 0; x < num_students; x++)
        {
            data[x] = inputFile.readLine();
        }
        inputFile.close();
        
        for(int x = 0; x < num_students; x++)
        {
            StringTokenizer strTokenizer = new StringTokenizer (data[x]," ");
            
            name[x] = strTokenizer.nextToken();
            GPA[x] = Double.parseDouble(strTokenizer.nextToken());
            hrs[x] = Integer.parseInt(strTokenizer.nextToken());
            rating[x] = Double.parseDouble(strTokenizer.nextToken());
        }
        
        System.out.println("#################################");
        System.out.println("Robotics Development Corporation");
        System.out.println("#################################\n");
        
        System.out.println("Task 1\n");
        
        System.out.println("Name" + "\t\t" + "GPA" + "\t    " + "Hours Earned" + "\t" + "Rating");
        rdc.task1();
        
        System.out.println("\nTask 2\n");
        
        System.out.println("Eligible Students:");
        rdc.task2();
        
        double[] weekly_pay = new double[name.length];
        int[] pay_rate = new int[name.length];
        for (int x = 0; x < name.length; x++)
        {
            if( hrs[x] <= 12){
                weekly_pay[x] = (hrs[x]* 10);
                pay_rate[x] = 10;
            }
            else if( hrs[x] > 13 && hrs[x] <=30){
                weekly_pay[x] = (hrs[x] * 11);
                pay_rate[x] = 11;
            }
            else if( hrs[x] > 31 && hrs[x] <= 48){
                weekly_pay[x] = (hrs[x] * 12);
                pay_rate[x] = 12;
            }
            else
            {
                weekly_pay[x] = (hrs[x] * 13);
                pay_rate[x] = 13;
            }
        }
        
        //RoboDev rdc2 = new RoboDev(weekly_pay , pay_rate);
        System.out.println("\nTask 3\n");
        
        System.out.println("Name" + "\t\t" + "Weekly Gross Pay");
        rdc.task3(weekly_pay, pay_rate);
        
        System.out.println("\nTask 4\n");
        
        System.out.println("Eligilbe Students" + "\t" + "GPA" + "\t" + "Hours Earned" + "\t" + "RPH" + "\t" + "Rating" + "\t" + "WGP");
        rdc.task4(weekly_pay, pay_rate);
        
        System.out.println("\nTask 5\n");
        
        System.out.println("Earned a $300 Book Voucher:");
        rdc.task5();
        
        System.out.println("\nTask 6\n");
        rdc.task6(name,weekly_pay, pay_rate);
    }
}