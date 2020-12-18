/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Programmer extends Employee {
	protected String theLanguage;

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}

	/**
	 * @param thePayrollNumBer
	 * @param theName
	 * @param theBasicMonthlySalary
	 * @param theLanguage
	 */
	public Programmer(int thePayrollNumBer, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumBer, theName, theBasicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	@Override
	public double getMonthlySalary() {
		if(!theLanguage.equalsIgnoreCase("Java"))
			return super.theBasicMonthlySalary;
		return super.theBasicMonthlySalary + (super.theBasicMonthlySalary * 0.2);
	}

	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10s", super.toString(), theLanguage, dFormat.format(getMonthlySalary()));
	}

	
	
	
}
