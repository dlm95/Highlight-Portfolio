/*
 * Derick Murphy
 * CSC 2331
 * Assignment 5
 */
public class Quizgrades {
	
	public static void main(String args[]){

	ListInterface<Double> quizScores = new LList<Double>();
	
	double[] grades = {2,3,5,6,10};
	
	//add grades to linkedlist
	for(int i = 0; i < grades.length; i++){
		quizScores.add(grades[i]);
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
	System.out.print("Remaining Scores: ");
	
	for(int i = 1; i < quizScores.getLength() + 1; i++)
	{
		System.out.print(quizScores.getEntry(i) + ", ");		
	}
	
	//Find avg of remaining grades
	double total = 0;
	for(int i = 1; i < quizScores.getLength() + 1; i++){
		total = total + quizScores.getEntry(i);
	}
		
	double avg = total/quizScores.getLength();
	System.out.println();
	System.out.println("Average: " + avg);
	}
	}
