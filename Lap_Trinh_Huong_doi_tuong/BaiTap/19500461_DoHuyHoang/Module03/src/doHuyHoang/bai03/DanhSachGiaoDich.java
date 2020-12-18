/**
 * 
 */
package doHuyHoang.bai03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DanhSachGiaoDich {
	private Set<GiaoDich> dsGiaoDichs;
	
	public DanhSachGiaoDich() {
		dsGiaoDichs = new HashSet<GiaoDich>();
	}
	
	public boolean them(GiaoDich p) {
		if(dsGiaoDichs.contains(p)) {
			return false;
		}
		dsGiaoDichs.add(p);
		return true;
	}
	
	@Override
	public String toString() {
		String s = "";

		for (GiaoDich giaoDich : dsGiaoDichs) {
			s += giaoDich + "\n";
		}

		return s;
	}
	// Xuat giao dich vang
	public DanhSachGiaoDich xuatGDVang() {
		DanhSachGiaoDich kq = new DanhSachGiaoDich();
		for (GiaoDich giaoDich : dsGiaoDichs) {
			if(giaoDich instanceof GiaoDichVang)
				kq.them(giaoDich);
		}
		return kq;
	}
	// Xuat giao dich tien te
	public DanhSachGiaoDich xuatGDTienTe() {
		DanhSachGiaoDich kq = new DanhSachGiaoDich();
		for (GiaoDich giaoDich : dsGiaoDichs) {
			if(giaoDich instanceof GiaoDichTienTe)
				kq.them(giaoDich);
		}
		return kq;
	}
	// Tinh tong so luong giao dich vang
	public int tinhTongSoLuongGDVang() {
		int dem = 0;

		for (GiaoDich giaoDich : dsGiaoDichs) {
			if(giaoDich instanceof GiaoDichVang)
				dem++;
		}
		return dem;
	}
	// Tinh tong so luong giao dich tien te
	public int tinhTongSoLuongGDTienTe() {
		int dem = 0;

		for (GiaoDich giaoDich : dsGiaoDichs) {
			if(giaoDich instanceof GiaoDichTienTe)
				dem++;
		}
		return dem;
	}
	// Tinh trung binh thanh tien cua giao dich tien te
	public double tinhTrungBinhCongThanhTienCuaGDTienTe() {
		double s = 0;
		int dem = 0;
		for (GiaoDich giaoDich : dsGiaoDichs) {
			if(giaoDich instanceof GiaoDichTienTe) {
				s += giaoDich.thanhTien();
				dem++;
			}
		}
		return s / dem;		
	}
	// Xuat ra cac giao dich co don gia > 1 ty
	public DanhSachGiaoDich xuatDonGiaLonHon1ty() {
		DanhSachGiaoDich kq = new DanhSachGiaoDich();
		for (GiaoDich giaoDich : dsGiaoDichs) {
			if(giaoDich.thanhTien() > 1000000000)
				kq.them(giaoDich);

		}
		return kq;
	}
}
