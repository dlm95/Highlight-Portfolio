/*
 * Assignment 5 Problem 1
 * Richard A. Clapp
 * November 12, 2015
 * CSC 2331-01
 */
public class Problem1 {
	
	public static void main(String args[]){

	ListInterface<Double> quizScores = new LList<Double>();
	
	double[] st1Scores = {100.0, 95.0, 90.0, 85.0, 80.0};
	
	for(int i = 0; i < st1Scores.length; i++){
		quizScores.add(st1Scores[i]);
		
	}
	int lowIndex = 1;
	double lowestScore = quizScores.getEntry(1);
	
	for(int i = 1; i <= quizScores.getLength(); i++){
		
		if(lowestScore <= quizScores.getEntry(i)){
			i++;
		}
		else if(lowestScore > quizScores.getEntry(i))
		{
			lowestScore = quizScores.getEntry(i);
			lowIndex = i;						
		}		
	}
	quizScores.remove(lowIndex);
	
	System.out.println("Lowest Score: " + lowestScore);
	System.out.println();
	System.out.println("Remaining Objects");
	
	for(int i = 1; i < quizScores.getLength(); i++)
	{
		System.out.println(quizScores.getEntry(i));		
	}
	
	//Find average of remaining scores.
	int divisor = quizScores.getLength();
	double total = 0.0;
	for(int i = 1; i <= quizScores.getLength(); i++){
		total = total + quizScores.getEntry(i);
	}
	
	double average = (total/divisor);
	System.out.println();
	System.out.println("Average: " + average);
	
	
}}
