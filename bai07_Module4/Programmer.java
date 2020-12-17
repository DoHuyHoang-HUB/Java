package bai07_Module4;

import java.text.DecimalFormat;

public class Programmer extends Employee {
	protected String theLanguage;

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	@Override
	public double getMonthlySalary() {
		if(theLanguage.equals("Java"))
			return super.theBasicMonthlySalary + (super.theBasicMonthlySalary * 0.2);
		return super.theBasicMonthlySalary;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10s", super.toString(), theLanguage, df.format(getMonthlySalary()));
	}
	
	
	
}
