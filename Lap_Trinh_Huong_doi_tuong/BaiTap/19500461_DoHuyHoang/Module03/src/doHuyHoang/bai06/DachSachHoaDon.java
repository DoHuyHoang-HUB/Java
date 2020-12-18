/**
 * 
 */
package doHuyHoang.bai06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DachSachHoaDon {
	private List<KhachSanX> dsHoaDon;
	
	
	/**
	 * @param dsHoaDon
	 */
	public DachSachHoaDon() {
		dsHoaDon = new ArrayList<KhachSanX>();
	}


	public boolean them(KhachSanX p) {
		if(dsHoaDon.contains(p))
			return false;
		dsHoaDon.add(p);
		return true;
	}
	@Override
	public String toString() {
		String s = "";

		for (KhachSanX khachSanX : dsHoaDon) {
			s += khachSanX + "\n";
		}

		return s;
	}
	// Thong ke so luong hoa don theo gio
	public int thongKeSoLuongHoaDonTheoGio() {
		int dem= 0;
		for (KhachSanX khachSanX : dsHoaDon) {
			if(khachSanX instanceof HoaDonTheoGio)
				dem++;
		}
		return dem;
	}
	// Thong ke so luong hoa don theo ngay
	public int thongKeSoLuongHoaDonTheoNgay() {
		int dem = 0;
		for (KhachSanX khachSanX : dsHoaDon) {
			if(khachSanX instanceof HoaDonTheoNgay)
				dem++;
		}
		return dem;
	}
	//Tinh tong thanh tien
	public double tinhTongThanhTien(int thang, int nam) {
		double s = 0;
		for (KhachSanX khachSanX : dsHoaDon) {
			if(khachSanX.getNgayHoaDon().getMonthValue() == thang && khachSanX.getNgayHoaDon().getYear() == nam)
				s += khachSanX.getThanhTien();
		}
		return s;
	}
}
