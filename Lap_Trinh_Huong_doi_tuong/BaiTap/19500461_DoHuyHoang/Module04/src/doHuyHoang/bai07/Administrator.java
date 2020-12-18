/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Administrator extends Employee {
	private String theDepartment;

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}

	/**
	 * @param thePayrollNumber
	 * @param theName
	 * @param theBasicMonthlySalary
	 * @param theDepartment
	 */
	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheDepartment(theDepartment);
	}
	
	@Override
	public double getMonthlySalary() {
		return super.theBasicMonthlySalary + (super.theBasicMonthlySalary * 0.2);
	}

	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10s", super.toString(), theDepartment, dFormat.format(getMonthlySalary()));
	}
	
	
}
