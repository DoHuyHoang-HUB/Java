/**
 * 
 */
package doHuyHoang.bai08;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Faculty extends Person {
	private String facultyID;
	private String office;
	public String getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	/**
	 * @param lastName
	 * @param firstName
	 * @param facultyID
	 * @param office
	 */
	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		setFacultyID(facultyID);
		setOffice(office);
	}
	public Faculty() {
		
	}
	@Override
	public String toString() {
		return String.format("\t\tGiang vien: %s (Khoa : %s)\n", super.toString(), office);
	}
	
	
}
