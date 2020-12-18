/**
 * 
 */
package doHuyHoang.bai08;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Student extends Person {
	private String studentID;
	private int yearMatriculated;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getYearMatriculated() {
		return yearMatriculated;
	}
	public void setYearMatriculated(int yearMatriculated) {
		this.yearMatriculated = yearMatriculated;
	}
	/**
	 * @param lastName
	 * @param firstName
	 * @param studentID
	 * @param yearMatriculated
	 */
	public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
		super(lastName, firstName);
		setStudentID(studentID);
		setYearMatriculated(yearMatriculated);
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return String.format("%-5s %s %-10d", studentID, super.toString(), yearMatriculated);
	}
	
	
}
