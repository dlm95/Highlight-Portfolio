/**
 * Derrick Murphy
 * Professor Caldwell
 * CSC 1311
 * 4/4/14
 * 
 * Sample Proficiency Exam #2
 */
import java.text.DecimalFormat;
public class pro
{
    private int num_fac = 18;
    
    private double ttl_pledges;
    private double avg_pledges;
    private int ttl_csc;
    private int ttl_mat;
    private int ttl_eng;
    private double csc_pledges;
    private double mat_pledges;
    private double eng_pledges;
    
    
    DecimalFormat fr = new DecimalFormat("$##,##0.00");
    
    public  void sort( double [ ] pledge_amounts, String[] name, String[] department, int[] miles, double[] apm )
    {
        
        int index;
        boolean flag = true;
        double temp;
        String ntemp;
        String dtemp;
        int mtemp;
        double atemp;
        
        while ( flag )
        {
            flag= false;
            for( index=0;  index < pledge_amounts.length -1;  index++ )
            {
                   if ( pledge_amounts[ index ] < pledge_amounts[index+1] )
                   {
                           temp = pledge_amounts[index];
                           ntemp = name[index];
                           dtemp = department[index];
                           mtemp = miles[index];
                           atemp = apm[index];
                           
                           pledge_amounts[ index ] = pledge_amounts[ index+1 ];
                           name[index] = name[index+1];
                           department[index] = department[index+1];
                           miles[index] = miles[index+1];
                           apm[index] = apm[index+1];
                           
                           pledge_amounts[ index+1 ] = temp;
                           name[index+1] = ntemp;
                           department[index+1] = dtemp;
                           miles[index+1] = mtemp;
                           apm[index+1] = atemp;
                           
                          flag = true;
                  } 
            } 
      } 
      
      for(index=0;index<name.length;index++)
      {
          System.out.println(name[index] + "\t\t" + fr.format(pledge_amounts[index]));
        }
    }
    
    public void tot_avg(double[] pledge_amounts)
    {
        for(int index = 0; index < num_fac; index++)
        {
            ttl_pledges = (pledge_amounts[index] + ttl_pledges);
        }
        avg_pledges = (ttl_pledges/num_fac);
        System.out.println("Total Pledges: " + ttl_pledges);
        System.out.println("Average Pledges: " + fr.format(avg_pledges));
    }
    
    public void csc(String[] department,double[] pledges_amount)
    {
        String key = "CSC";
        
        for(int index = 0; index < num_fac; index++)
        {
            if(department[index].equals(key))
            {
                ttl_csc++;
                csc_pledges += pledges_amount[index];
                
            }
        }
        System.out.println("Total Participants from CSC: " + ttl_csc);
        System.out.println("Total Pledges: " + fr.format(csc_pledges));
    }
    
    public void mat(String[] department,double[] pledges_amount)
    {
        String key = "MAT";
        
        for(int index = 0; index < num_fac; index++)
        {
            if(department[index].equals(key))
            {
                ttl_mat++;
                mat_pledges += pledges_amount[index];
            }
        }
        System.out.println("Total Participants from MAT: " + ttl_mat);
        System.out.println("Total Pledges: " + fr.format(mat_pledges));
    }
    
    public void eng(String[] department,double[] pledges_amount)
    {
        String key = "ENG";
        
        for(int index = 0; index < num_fac; index++)
        {
            if(department[index].equals(key))
            {
                ttl_eng++;
                eng_pledges += pledges_amount[index];
            }
        }
        System.out.println("Total Participants from ENG: " + ttl_eng);
        System.out.println("Total Pledges: " + fr.format(eng_pledges));
    }
    
    public void winner()
    {
      int index;
       boolean flag = true;
      double[] most_pledges = {csc_pledges,mat_pledges,eng_pledges};
      String[] depart = {"CSC","MAT","ENG"};
      double temp;
      String dtemp;
      
      
        while ( flag )
        {
            flag= false;
            for( index=0;  index < most_pledges.length -1;  index++ )
            {
                   if ( most_pledges[ index ] < most_pledges[index+1] )
                   {
                           temp = most_pledges[index];
                           dtemp = depart[index];
                           
                           most_pledges[index] = most_pledges[index+1];
                           depart[index] = depart[index+1];
                           
                           most_pledges[index+1] = temp;
                           depart[index+1] = dtemp;
                           
                          flag = true;
                  } 
            } 
      } 
      
          System.out.println("The winner of the march of dimes is " + depart[0]);
      
    }
}
