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
public class Section {
	private Set<Enrolment> dsEnrolls;
	private String semester;
	private String sectionNbr;
	private String room;
	private Faculty facultyMember;
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSectionNbr() {
		return sectionNbr;
	}
	public void setSectionNbr(String sectionNbr) {
		this.sectionNbr = sectionNbr;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	/**
	 * @param dsEnrolls
	 * @param semester
	 * @param sectionNbr
	 * @param room
	 * @param facultyMember
	 */
	public Section(String sectionNbr, String semester, String room, Faculty facultyMember, Set<Enrolment> dsEnrolls) {
		this.dsEnrolls = new HashSet<Enrolment>(dsEnrolls);
		setRoom(room);
		setSectionNbr(sectionNbr);
		setSemester(semester);
		this.facultyMember = facultyMember;
	}
	@Override
	public String toString() {
		return String.format("\t\t=====Thong tin hoc phan=====\n\t\tMa hoc phan: %s\n\t\tHoc ki: %s\n\t\tPhong hoc: %s\n%s%s", sectionNbr, semester, room, facultyMember, dsEnrolls);
	}
	
	
	
}
