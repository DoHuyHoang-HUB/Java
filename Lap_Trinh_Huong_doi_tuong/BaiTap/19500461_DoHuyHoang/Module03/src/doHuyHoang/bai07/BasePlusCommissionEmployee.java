/**
 * 
 */
package doHuyHoang.bai07;

import java.text.DecimalFormat;

/**
 * @author Do-Huy-Hoang
 *
 */
public class BasePlusCommissionEmployee extends Employee {
	private double grossSales;
	private float commissionRate;
	private double baseSalary;
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
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param sSN
	 * @param grossSales
	 * @param commissionRate
	 * @param baseSalary
	 */
	public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double grossSales,
			float commissionRate, double baseSalary) {
		super(firstName, lastName, sSN);
		setBaseSalary(baseSalary);
		setCommissionRate(commissionRate);
		setGrossSales(grossSales);
	}
	
	@Override
	public double salary() {
		return (commissionRate * grossSales) + baseSalary;
	}
	
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10.1f %-10s %-10s", super.toString(), dFormat.format(grossSales), commissionRate, dFormat.format(baseSalary), dFormat.format(salary()));
	}
}
