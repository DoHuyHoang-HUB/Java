/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public class CommissionEmployee extends Employee {
	private double grossSales;
	private float commissionRate;
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public float getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param sSN
	 * @param grossSales
	 * @param commissionRate
	 */
	public CommissionEmployee(String firstName, String lastName, String sSN, double grossSales, float commissionRate) {
		super(firstName, lastName, sSN);
		setCommissionRate(commissionRate);
		setGrossSales(grossSales);
	}
	
	@Override
	public double salary() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10.1f %-10s", super.toString(), dFormat.format(grossSales), commissionRate, dFormat.format(salary()));
	}
	
}
