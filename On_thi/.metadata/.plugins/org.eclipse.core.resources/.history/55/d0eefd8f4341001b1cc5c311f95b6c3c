package bai07_Module4;

import java.text.DecimalFormat;

public class Administrator extends Employee {
	private String theDepartment;

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheDepartment(theDepartment);
	}

	@Override
	public double getMonthlySalary() {
		return super.theBasicMonthlySalary + (super.theBasicMonthlySalary * 0.4);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %-10s %s", super.toString(), theDepartment, df.format(getMonthlySalary()));
	}
	
	
}
