package bai07_Module4;

public class ProjectLeader extends Programmer {

	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
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
