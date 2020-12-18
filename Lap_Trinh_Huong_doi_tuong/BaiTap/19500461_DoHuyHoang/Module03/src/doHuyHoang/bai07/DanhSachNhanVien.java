/**
 * 
 */
package doHuyHoang.bai07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DanhSachNhanVien {
	private List<Employee> dsNhanVien;

	/**
	 * @param dsNhanVien
	 */
	public DanhSachNhanVien() {
		dsNhanVien = new ArrayList<Employee>();
	}
	
	public boolean them(Employee p) {
		if(dsNhanVien.contains(p))
			return false;
		dsNhanVien.add(p);
		return true;
	}
	
	@Override
	public String toString() {
		String s = "";

		for (Employee employee : dsNhanVien) {
			s += employee + "\n";
		}

		return s;
	}

	// Xuất nhân viên SalariedEmployee
	public DanhSachNhanVien xuatSalariedEmployee() {
		DanhSachNhanVien kq = new DanhSachNhanVien();
		for (Employee employee : dsNhanVien) {
			if(employee instanceof SalariedEmployee)
				kq.them(employee);
		}
		return kq;
	}
	// Xuất nhân viên HourEmployee
	public DanhSachNhanVien xuatHourEmployee() {
		DanhSachNhanVien kq = new DanhSachNhanVien();
		for (Employee employee : dsNhanVien) {
			if(employee instanceof HourEmployee)
				kq.them(employee);
		}
		return kq;
	}
	// Xuất nhân viên CommissionEmployee
	public DanhSachNhanVien xuatCommissionEmployee() {
		DanhSachNhanVien kq = new DanhSachNhanVien();
		for (Employee employee : dsNhanVien) {
			if(employee instanceof CommissionEmployee)
				kq.them(employee);
		}
		return kq;
	}
	// Xuất nhân viên BasePlusCommissionEmployee
	public DanhSachNhanVien xuatBasePlusCommissionEmployee() {
		DanhSachNhanVien kq = new DanhSachNhanVien();
		for (Employee employee : dsNhanVien) {
			if(employee instanceof BasePlusCommissionEmployee)
				kq.them(employee);
		}
		return kq;
	}
	
}
