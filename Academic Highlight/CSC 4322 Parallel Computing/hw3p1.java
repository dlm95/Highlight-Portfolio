/**1.	Java Program Suppose the run-time of a serial program is given by T(serial) = n^2,
 *  where the units of the run-time are in microseconds. 
 *  Suppose that a parallelization of this program has run-time T(parallel) = n^2/p + log2(p). 
 *  Write a program that finds the speedups and efficiencies of this program for various values of n and p. 
 *  Run your program with n = 10, 20, 30, 40, … ,320, and p = 1, 2, 4, … ,128. 
 *  What happens to the speedups and efficiencies as p is increased and n is held fixed? 
 *  What happens when p is fixed and n is increased?//
**/
package hw3;

import java.util.Scanner;
import java.math.*;

public class p1 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double n;
		double comm_size;
		double speedup;
		double efficiency;
		//input
		System.out.println ("number of N: \n");
		n=keyboard.nextDouble();
		
		System.out.println ("number of processors: \n");
		comm_size=keyboard.nextDouble();
		
		// Compute
		double serial = n*n;
		double parallel = (n*n)/comm_size + (Math.log(comm_size)/ Math.log(2));
		speedup= serial / parallel;
		efficiency = speedup / parallel;
		
		// Display
		System.out.println( "Your serial is "+ serial );
		System.out.println( "Your parallel is "+ parallel );
		System.out.println( "Your speedup is "+ speedup );
		System.out.println( "Your effiency is "+ efficiency );
}
}
