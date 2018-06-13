public class RoboDev
{
    private String[] name;
    private double[] GPA;
    private int[] hrs;
    private double[] rating;
    //private double[] weekly_pay = new double[name.length];
    //private int[] pay_rate = new int[name.length];
    private int vouchers;
    
    public RoboDev(String[] n, double[] g , int[] h, double[] r)
    {
        name = n;
        GPA = g;
        hrs = h;
        rating = r;
    }
    
    public void task1()
    {
        for(int x = 0; x < name.length; x++)
        {
            System.out.println(name[x] + "\t\t" + GPA[x] + "\t\t" + hrs[x] + "\t\t" + rating[x]);
        }
    }
    
    public void task2()
    {
        boolean flag = true;
        double temp;
        String ntemp;
        int htemp;
        double rtemp;
        
        while(flag)
        {
            flag = false;
            for ( int x = 0; x < GPA.length -1; x++)
            {
                if ( GPA[x] < GPA[x+1] )
                {
                    temp = GPA[x];
                    ntemp = name[x];
                    htemp = hrs[x];
                    rtemp = rating[x];
                    
                    GPA[x] = GPA[x+1];
                    name[x] = name[x+1];
                    hrs[x] = hrs[x+1];
                    rating[x] = rating[x+1];
                    
                    GPA[x+1] = temp;
                    name[x+1] = ntemp;
                    hrs[x+1] = htemp;
                    rating[x+1] = rtemp;
                    
                    flag = true;
                }
            }
        }
        
        for ( int index = 0; index < GPA.length; index++)
        {
            if ( GPA[index] >= 3.0 )
            System.out.println(name[index]);
        }
    }
    
    public void task3(double[] weekly_pay, int[] pay_rate)
    {
       
        for (int index = 0; index < name.length; index++)
        {
            System.out.println(name[index] + "\t\t$" + weekly_pay[index]);
        }
    }
    
    public void task4(double[] weekly_pay, int[] pay_rate)
    {
        for ( int x = 0; x < name.length; x++)
        {
            if ( GPA[x] >= 3.0 )
            {
                System.out.println(name[x] + "\t\t" + GPA[x] + "\t\t" + hrs[x] + "\t\t$" + pay_rate[x] + "\t\t" + rating[x] + "\t\t$" + weekly_pay[x]);
            }
        }
    }
    
    public void task5()
    {
        for( int x = 0; x < name.length; x++)
        {
            if( hrs[x]>=75) {
            vouchers++;
            System.out.println(name[x]);
        }
        }
    }
    
    public void task6(String[] name,double[] weekly_pay, int[] pay_rate)
    {
        int bonus;
        int total_pay = 0;
        
        bonus = vouchers * 300;
        
        for ( int x = 0; x < name.length; x++)
        {
            total_pay += weekly_pay[x];
        }
        
        System.out.println("Total Bonuses: $" + bonus);
        System.out.println("Total Pay: $" + total_pay);
        System.out.println("Total Students:" + name.length);
    }
}
        