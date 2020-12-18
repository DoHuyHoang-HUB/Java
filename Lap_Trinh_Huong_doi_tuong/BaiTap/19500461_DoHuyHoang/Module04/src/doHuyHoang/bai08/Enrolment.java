/**
 * 
 */
package doHuyHoang.bai08;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Enrolment {
	private String status;
	private String grade;
	private double numGrade;
	private Student student;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getNumGrade() {
		return numGrade;
	}
	public void setNumGrade(Double numGrade) {
		this.numGrade = numGrade;
	}
	/**
	 * @param status
	 * @param grade
	 * @param numGrade
	 * @param student
	 */
	public Enrolment(Student student, String status, String grade, double numGrade) {
		this.student = student;
		setGrade(grade);
		setNumGrade(numGrade);
		setStatus(status);
	}
	@Override
	public String toString() {
		return String.format("\t\t%s %-10s %-10s %f\n", student, status, grade, numGrade);
	}

}
