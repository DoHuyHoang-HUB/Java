/**
 * 
 */
package doHuyHoang.bai05;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DanhSachHoaDonCuaKhachHang {
	private Set<KhachHang> dsKhachHangs;
	
	public DanhSachHoaDonCuaKhachHang() {
		dsKhachHangs = new HashSet<KhachHang>();
	}
	
	public boolean them(KhachHang p) {
		dsKhachHangs.add(p);
		return true;
	}
	// Xuat khach hang viet nam
	public DanhSachHoaDonCuaKhachHang xuatKHVN() {
		DanhSachHoaDonCuaKhachHang kq = new DanhSachHoaDonCuaKhachHang();
		for (KhachHang khachHang : dsKhachHangs) {
			if(khachHang instanceof KhachHangVN)
				kq.them(khachHang);
		}
		return kq;
	} 
	// Xuat khach hang nuoc ngoai
	public DanhSachHoaDonCuaKhachHang xuatKHNuocNgoai() {
		DanhSachHoaDonCuaKhachHang kq = new DanhSachHoaDonCuaKhachHang();
		for (KhachHang khachHang : dsKhachHangs) {
			if(khachHang instanceof KhachHangNuocNgoai)
				kq.them(khachHang);
		}
		return kq;
	}
	// Tính tong số lượng cho từng loại khách hàng
	public int TongSLKhachHangVN() {
		int dem = 0;
		for (KhachHang khachHang : dsKhachHangs) {
			if(khachHang instanceof KhachHangVN)
				dem++;
		}
		return dem;
	}
	public int tongSLKHNuocNgoai() {
		int dem = 0;
		 for (KhachHang khachHang : dsKhachHangs) {
			if(khachHang instanceof KhachHangNuocNgoai)
				dem++;
		}
		 return dem;
	}
	// Trung binh thanh tien cua khach hang nuoc ngoai
	public double TBThanhTienKHNuocNgoai() {
		double s = 0;
		int dem = 0;
		for (KhachHang khachHang : dsKhachHangs) {
			if(khachHang instanceof KhachHangNuocNgoai) {
				s += khachHang.getThanhTien();
				dem++;
			}
		}
		return s / dem;
	}
	// Xuat cac hoa don khach hang trong thang 9 nam 2018 (của cả hai loai khach hang)
	public DanhSachHoaDonCuaKhachHang xuatHoaDon() {
		DanhSachHoaDonCuaKhachHang kq = new DanhSachHoaDonCuaKhachHang();
		for (KhachHang khachHang : dsKhachHangs) {
			if(khachHang.getNgayLapHoaDon().getMonthValue() == 9 && khachHang.getNgayLapHoaDon().getYear() == 2018)
				kq.them(khachHang);
		}	
		return kq;
	}
}
