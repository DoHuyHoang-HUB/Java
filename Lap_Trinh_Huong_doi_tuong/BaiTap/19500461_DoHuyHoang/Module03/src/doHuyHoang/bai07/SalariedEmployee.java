/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param sSN
	 * @param weeklySalary
	 */
	public SalariedEmployee(String firstName, String lastName, String sSN, double weeklySalary) {
		super(firstName, lastName, sSN);
		setWeeklySalary(weeklySalary);
	}

	@Override
	public double salary() {
		return weeklySalary; 
	}

	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10s", super.toString(), dFormat.format(weeklySalary), dFormat.format(salary()));
	}
	
}
