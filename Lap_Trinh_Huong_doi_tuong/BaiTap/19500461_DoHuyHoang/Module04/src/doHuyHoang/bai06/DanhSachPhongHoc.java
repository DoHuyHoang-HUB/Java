/**
 * 
 */
package doHuyHoang.bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DanhSachPhongHoc {
	private List<PhongHoc> dsPhongHoc;

	/**
	 * @param dsPhongHoc
	 */
	public DanhSachPhongHoc() {
		dsPhongHoc = new ArrayList<PhongHoc>();
	}
	
	public boolean them(PhongHoc p) {
		if(dsPhongHoc.contains(p))
			return false;
		dsPhongHoc.add(p);
		return true;
	}

	@Override
	public String toString() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			s += phongHoc + "\n";
		}
		return s;
	}
	// Tim kiem phong hoc
	public List<PhongHoc> timKien(String maPhong){
		List<PhongHoc> temp = new ArrayList<PhongHoc>();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if(phongHoc.getMaPhong().equals(maPhong))
				temp.add(phongHoc);
		}
		return temp;
	}
	// Lay thong tin cac phong hoc dat chuan
	public DanhSachPhongHoc phongHocDatChuan() {
		DanhSachPhongHoc s = new DanhSachPhongHoc();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if(phongHoc.getDanhGia().equalsIgnoreCase("Dat chuan"))
				s.them(phongHoc);
		}
		return s;
	}
	// Sap xep danh sach tang dan theo day nha
	public void sapXepTangDanTheoDayNha() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return o1.getDayNha().compareTo(o2.getDayNha());
			}
			
		});
	}
	// Sap xep danh sach giam dan theo dien tich
	public void sapXepGiamDanTheoDienTich() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return Double.compare(o2.getDienTich(), o1.getDienTich());
			}
			
		});
	}
	// Sap xep danh sach tang dan theo so bong den
	public void sapXepTangDanTheoSoBongDen() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
			}
			
		});
	}
	// Cap nhat so may tinh cho mot phong may tinh nao do khi biet ma phong
	public boolean capNhat(String ma, int soMayTinhNew) {
		for (PhongHoc phongHoc : dsPhongHoc) {
			if(phongHoc instanceof PhongMayTinh)
				if(phongHoc.getMaPhong().equalsIgnoreCase(ma)) {
					((PhongMayTinh) phongHoc).setsoMayTinh(soMayTinhNew);
					return true;
				}
		}
		return false;
	}
	// Xoa mot phong nao do khi biet ma phong 
	public boolean xoaTheoMa(String ma) {	
		return dsPhongHoc.removeIf(hh->hh.getMaPhong() == ma);
	}
	// Tinh tong so phong hoc 
	public int tinhTongSoPhongHoc() {
		int dem = 0;
		for (int i = 0; i < dsPhongHoc.size(); i++) {
			dem++;
		}
		return dem;
	}
	// Lay danh sach cac phong may co 60 may
	public DanhSachPhongHoc phongMayCo60May() {
		DanhSachPhongHoc kq = new DanhSachPhongHoc();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if(phongHoc instanceof PhongMayTinh)
				if(((PhongMayTinh) phongHoc).getsoMayTinh() == 60)
					kq.them(phongHoc);
		}
		return kq;
	}
}
