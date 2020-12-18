/**
 * 
 */
package doHuyHoang.bai04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DanhSachGiaoDichNhaDat {
	private List<GiaoDichNhaDat> dsGiaoDichNhaDats;
	
	public DanhSachGiaoDichNhaDat() {
		dsGiaoDichNhaDats = new ArrayList<GiaoDichNhaDat>();
	}
	
	public boolean them(GiaoDichNhaDat p) {
		if(dsGiaoDichNhaDats.contains(p)) {
			return false;
		}
		dsGiaoDichNhaDats.add(p);
		return true;
	}
	
	@Override
	public String toString() {
		String s = "";

		for (GiaoDichNhaDat giaoDichNhaDat : dsGiaoDichNhaDats) {
			s += giaoDichNhaDat + "\n";
		}

		return s;
	}
	// Tinh tong so luong cua giao dich dat
	public int tinhTongSoLuongGDDat() {
		int dem = 0;

		for (GiaoDichNhaDat giaoDichNhaDat : dsGiaoDichNhaDats) {
			if(giaoDichNhaDat instanceof GiaoDichDat)
				dem++;
		}

		return dem;
	}
	// Tinh tong so luong cua giao dich dat
	public int tinhTongSoLuongGDNha() {
		int dem = 0;

		for (GiaoDichNhaDat giaoDichNhaDat : dsGiaoDichNhaDats) {
			if(giaoDichNhaDat instanceof GiaoDichNha)
				dem++;
		}

		return dem;
	}
	// Tinh trung binh cong thanh tien cua giao dich dat
	public double tinhTrungBinhCongThanhTienCuaGDDat() {
		double s = 0;
		int dem = 0;
		for (GiaoDichNhaDat giaoDichNhaDat : dsGiaoDichNhaDats) {
			if(giaoDichNhaDat instanceof GiaoDichDat) {
				s += giaoDichNhaDat.getThanhTien();
				dem++;
			}
		}
		return s / dem;		
	}
	// Xuat ra cac giao dich cua thang 9 nam 2013
	public DanhSachGiaoDichNhaDat XuatGD(){
		DanhSachGiaoDichNhaDat kq = new DanhSachGiaoDichNhaDat();
		for (GiaoDichNhaDat giaoDichNhaDat : dsGiaoDichNhaDats) {
			if(giaoDichNhaDat.getNgayGiaoDich().getMonthValue() == 9 && giaoDichNhaDat.getNgayGiaoDich().getYear() == 2013 )
				kq.them(giaoDichNhaDat);
		}
		return kq;
	}
}
