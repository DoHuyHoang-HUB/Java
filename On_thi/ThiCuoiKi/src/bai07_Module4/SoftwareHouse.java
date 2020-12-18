package bai07_Module4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoftwareHouse {
	private String aName;
	private List<Employee> dsEmployees;
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public SoftwareHouse(String aName) {
		dsEmployees = new ArrayList<Employee>();
		setaName(aName);
	}
	public boolean addEmployee(Employee e) {
		if(dsEmployees.contains(e))
			return false;
		dsEmployees.add(e);
		return true;
	}
	@Override
	public String toString() {
		String s = "";
		for (Employee employee : dsEmployees) {
			s += employee + "\n";
		}
		return s;
	}
	public double getMonthlySalaryBill() {
		double sum = 0;
		for (Employee employee : dsEmployees) {
			sum += employee.getMonthlySalary();
		}
		return sum;
	}
	public void sortAllStaffByName() {
		Collections.sort(dsEmployees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getTheName().compareTo(o2.getTheName());
			}
			
		});
		
	}
	public SoftwareHouse displayListProgrammer() {
		SoftwareHouse kq = new SoftwareHouse(aName);
		for (Employee employee : dsEmployees) {
			if(employee instanceof Programmer)
				kq.addEmployee(employee);
		}
		return kq;
	}
	public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		for (Employee employee : dsEmployees) {
			if(employee instanceof Administrator)
				if(employee.getThePayrollNumber() == aPayrollNo) {
					((Administrator) employee).setTheDepartment(deptNew);
					return true;
				}
		}
		return false;
	}
	public boolean deleteEmployee(int aPayrollNo) {
		return dsEmployees.removeIf(hh->hh.getThePayrollNumber() == aPayrollNo);
	}
	public boolean isEmpty() {
		if(dsEmployees.isEmpty() == true)
			return false;
		return true;
	}
}
