/**
 * 
 */
package doHuyHoang.bai08;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Course {
	private String courseNbr;
	private String courseTitile;
	private int credits;
	private Set<Section> sections;
	public String getCourseNbr() {
		return courseNbr;
	}
	public void setCourseNbr(String courseNbr) {
		this.courseNbr = courseNbr;
	}
	public String getCourseTitile() {
		return courseTitile;
	}
	public void setCourseTitile(String courseTitile) {
		this.courseTitile = courseTitile;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @param courseNbr
	 * @param courseTitile
	 * @param credits 
	 */
	public Course(String courseNbr, String courseTitile, int credits) {
		sections = new HashSet<Section>();
		setCourseNbr(courseNbr);
		setCourseTitile(courseTitile);
		setCredits(credits);
	}
	public Course() {
		
	}
	
	public void addSection(String sectionNbr, String semester, String room, Faculty facultyMember, Set<Enrolment> dsEnrolls) {
		Section section = new Section(sectionNbr, semester, room, facultyMember, dsEnrolls);
		sections.add(section);
	}
	
	@Override
	public String toString() {
		return String.format("Khoa hoc: [%s\t- %s (%dTC)]\n%s", courseNbr, courseTitile, credits, sections);
	}
	
	
}
