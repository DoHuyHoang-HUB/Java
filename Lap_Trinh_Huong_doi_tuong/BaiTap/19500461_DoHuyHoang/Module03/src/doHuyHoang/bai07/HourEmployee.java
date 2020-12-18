/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public class HourEmployee extends Employee {
	private double wage;
	private float hour;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHour() {
		return hour;
	}
	public void setHour(float hour) {
		this.hour = hour;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param sSN
	 * @param wage
	 * @param hour
	 */
	public HourEmployee(String firstName, String lastName, String sSN, double wage, float hour) {
		super(firstName, lastName, sSN);
		setWage(wage);
		setHour(hour);
	}
	
	@Override
	public double salary() {
		if(hour <= 40)
			return wage * hour;
		return 40 * wage + (hour - 40) * wage * 1.5;
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10f %-10s", super.toString(), dFormat.format(wage), hour, dFormat.format(salary()));
	}
	
}
