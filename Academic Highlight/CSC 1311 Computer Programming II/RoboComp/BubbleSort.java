public class BubbleSort
{
       public static void sort(String[] name, int[] category, double[] averages)
      {
            boolean flag = true; 
            
            String ntemp;
            int ctemp2;
            double atemp3;
            
            while(flag)  {
                  flag = false;
                  for (int x = 0; x < name.length - 1; x++ ) {
                          if (name[x].compareToIgnoreCase(name[x+1]) > 0) { 
                              
                                      ntemp = name[x];
                                      ctemp2 = category[x];
                                      atemp3 = averages[x];
                                      
                                      name[x] = name[x+1];
                                      category[x] = category[x+1];
                                      averages[x] = averages[x+1];
                                      
                                      name[x+1] = ntemp;
                                      category[x+1] = ctemp2;
                                      averages[x+1] = atemp3;
                                      
                                      flag = true;
                          }
                   }
            }
      }
    }