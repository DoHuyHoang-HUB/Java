/**
 * 
 */
package doHuyHoang.bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Do-Huy-Hoang
 *
 */
public class SoftwareHouse {
	private String aName;
	private List<Employee> congTyPhanMem;
	
	
	public String getaName() {
		return aName;
	}


	public void setaName(String aName) {
		this.aName = aName;
	}


	/**
	 * @param aName
	 * @param congTyPhanMem
	 */
	public SoftwareHouse(String aName) {
		congTyPhanMem = new ArrayList<Employee>();
		setaName(aName);
	}
	
	// Hien thi toan bo nhan vien trong cong ty len man hinh theo dang 
		// cot dinh dang don vi tien te la $, phan cach hang tram nghin
	@Override
	public String toString() {
		String s = "";
		for (Employee employee : congTyPhanMem) {
			s += employee + "\n";
		}
		return aName + "\n" + s;
	}


	public boolean them(Employee p) {
		if(congTyPhanMem.contains(p))
			return false;
		congTyPhanMem.add(p);
		return true;
	}
	// Tinh tong tien phai tra cho cac nhan vien\
	public double getMonthSalaryBill() {
		double kq = 0;
		for (Employee employee : congTyPhanMem) {
			kq += employee.getMonthlySalary();
		}
		return kq;
	}
	// Sap xep danh sach nhan vien theo ten
	public void sapXepTangDanTheoTen() {
		Collections.sort(congTyPhanMem, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getTheName().compareTo(o2.getTheName());
			}
			
		});
	}
	// Hien thi danh sach cac lap trinh vien
	public SoftwareHouse dSLapTrinhVien() {
		SoftwareHouse kq = new SoftwareHouse(aName);
		for (Employee employee : congTyPhanMem) {
			if(employee instanceof Programmer)
				kq.them(employee);
		}
		return kq;
	}
	// Cap nhat phong ban
	public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		for (Employee employee : congTyPhanMem) {
			if(employee instanceof Administrator)
				if(employee.getThePayrollNumber() == aPayrollNo) {
					((Administrator) employee).setTheDepartment(deptNew);
					return true;
				}
		}
		return false;
	}
	// Xoa nhan vien
	public boolean xoaTheoMa(int ma) {	
		return congTyPhanMem.removeIf(hh->hh.getThePayrollNumber() == ma);
	}
}
