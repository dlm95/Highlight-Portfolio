/* File:       
 *    mpi_hello.c
 *
 * Purpose:    
 *    A "hello,world" program that uses MPI
 *
 * Compile:    
 *    mpicc -g -Wall -std=C99 -o mpi_hello mpi_hello.c
 * Usage:        
 *    mpiexec -n<number of processes> ./mpi_hello
 *
 * Input:      
 *    None
 * Output:     
 *    A greeting from each process
 *
 * Algorithm:  
 *    Each process sends a message to process 0, which prints 
 *    the messages it has received, as well as its own message.
 *
 * IPP:  Section 3.1 (pp. 84 and ff.)
 */
#include <stdio.h>
#include <string.h>  /* For strlen             */
#include <mpi.h>     /* For MPI functions, etc */ 

const int MAX_STRING = 100;

double computesum(double *mytimes, int length){
	double sum = 0;
	for (int i = 0; i < length; i++) {
		sum += mytimes[i];
		}
		printfb("%d \n", sum);
		return sum / length;
}


int main(void) {
   char       greeting[MAX_STRING];  /* String storing message */
   int        comm_sz;               /* Number of processes    */
   int        my_rank;               /* My process rank        */
   double	  time[24] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
   double     mytimes[8];
   

   /* Start up MPI */
   MPI_Init(NULL, NULL); 

   /* Get the number of processes */
   MPI_Comm_size(MPI_COMM_WORLD, &comm_sz); 

   /* Get my rank among all the processes */
   MPI_Comm_rank(MPI_COMM_WORLD, &my_rank); 
   
   /*Scatter time among processes*/
   MPI_Scatter(time, 8, MPI_DOUBLE, mytimes, 8, MPI_DOUBLE, 0,MPI_COMM_WORLD);
   
   //After scatter you want to comput the average of each mytimes 
   //So make a function that computes the avargae of each sub set
   /*
	in that fuction yoiu need to return each nodes avg and save them in a var
	
	After that use mpi reduce avg to find the avg of all returned values
	print with the 0 node
	
	Then use mpi reduce to find the max from the returned values 
   
   */
   
   double myAvg = 0;
   myAvg = computesum(mytimes,8);
   //printf("%f  \n", myAvg);
   
   
  
   /* Shut down MPI */
   MPI_Finalize(); 

   return 0;
}  /* main */
