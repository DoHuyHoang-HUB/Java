/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public abstract class Employee {
	protected int thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}
	public void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber;
	}
	public String getTheName() {
		return theName;
	}
	public void setTheName(String theName) {
		this.theName = theName;
	}
	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}
	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}
	/**
	 * @param thePayrollNumber
	 * @param theName
	 * @param theBasicMonthlySalary
	 */
	public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
		setTheBasicMonthlySalary(theBasicMonthlySalary);
		setTheName(theName);
		setThePayrollNumber(thePayrollNumber);
	}
	
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%-5d %-20s %-10s", thePayrollNumber, theName, dFormat.format(theBasicMonthlySalary));
	}
	public abstract double getMonthlySalary();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + thePayrollNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (thePayrollNumber != other.thePayrollNumber)
			return false;
		return true;
	}
	
	
}
