package GradeCalculator;

public class GPA {

	private double cumulativeGPA;
	private double semesterGPA;
	
	public GPA(double cumGPA, double semGPA) {
		setCumulativeGPA(cumGPA);
		setSemesterGPA(semGPA);
	}

	public double getCumulativeGPA() {
		return cumulativeGPA;
	}

	public void setCumulativeGPA(double cumulativeGPA) {
		this.cumulativeGPA = cumulativeGPA;
	}

	public double getSemesterGPA() {
		return semesterGPA;
	}

	public void setSemesterGPA(double semesterGPA) {
		this.semesterGPA = semesterGPA;
	}
}
