package GradeCalculator;

public class GradeCalculator {

	private double currentCumGPA;
	private double totalCredits;
	private double[] credits;
	private String[] letterGrades;

	
	public GradeCalculator(double curCumGPA, double curTotalCredits, double[] currentCredits, String[] currentGrades) {
		currentCumGPA = curCumGPA;
		totalCredits = curTotalCredits;
		credits = currentCredits;
		letterGrades = currentGrades;
	}
	
	public double convertGrade(String letter) {
		double result;
		switch (letter) {
			case "A": result = 4.0;
			break;
			case "B+": result = 3.5;
			break;
			case "B": result = 3.0;
			break;
			case "C+": result = 2.5;
			break;
			case "C": result = 2.0;
			break;
			case "D": result = 1.0;
			break;
			case "F": result = 0.0;
			break;
			default: return 0.0;
			
		}
		return result;
	}
	
	//find semester GPA
	public double processCurGPA() {
		double gradesXcredits = 0.0, currentTotalCrd = 0.0;
		double[] convertGrades = new double[7];
		for (int i = 0; i < letterGrades.length; i++) {
			convertGrades[i] = convertGrade(letterGrades[i]);
			gradesXcredits += convertGrades[i] * credits[i];
			currentTotalCrd += credits[i];
		}
		return gradesXcredits/currentTotalCrd;
	}
	
	public double processCumGPA(double semGPA) {
		double prevCredxGrade, prevTotalCrd, currentGPA = semGPA;
		double currCredxGrade = 0, currTotalCrd = 0;
		prevCredxGrade = currentCumGPA * totalCredits;
		prevTotalCrd = totalCredits;
		for (int i = 0; i < credits.length; i++) {
			currTotalCrd += credits[i]; 
		}
		
		currCredxGrade += currentGPA * currTotalCrd;
		
		currentCumGPA = (currCredxGrade + prevCredxGrade)/(prevTotalCrd + currTotalCrd);
		System.out.println(Double.toString(currentCumGPA));
		return currentCumGPA;
	}
	
}
