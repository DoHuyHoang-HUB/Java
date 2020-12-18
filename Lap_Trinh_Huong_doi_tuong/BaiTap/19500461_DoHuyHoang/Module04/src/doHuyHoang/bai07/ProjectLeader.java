/**
 * 
 */
package doHuyHoang.bai07;

/**
 * @author Do-Huy-Hoang
 *
 */
public class ProjectLeader extends Programmer {

	/**
	 * @param thePayrollNumBer
	 * @param theName
	 * @param theBasicMonthlySalary
	 * @param theLanguage
	 */
	public ProjectLeader(int thePayrollNumBer, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumBer, theName, theBasicMonthlySalary, theLanguage);
	}
	
	@Override
	public double getMonthlySalary() {
		return super.theBasicMonthlySalary + (super.theBasicMonthlySalary * 0.2);
	}

	@Override
	public String toString() {
		return String.format("%s", super.toString());
	}
	
}
