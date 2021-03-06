/**
 * 
 */
package doHuyHoang.bai08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DanhSachHangHoa {
	private List<HangHoa> dsHangHoa;/**
	 * 
	 */
	public DanhSachHangHoa() {
		dsHangHoa = new ArrayList<HangHoa>();
	}
	
	public boolean them(HangHoa p) {
		if(dsHangHoa.contains(p))
			return false;
		dsHangHoa.add(p);
		return true;
	}

	@Override
	public String toString() {
		String s = "";
		for (HangHoa hangHoa : dsHangHoa) {
			s += hangHoa + "\n";
		}
		return s;
	}
	
	// Tra ve danh sach hang thuc pham
	public DanhSachHangHoa hangThucPham() {
		DanhSachHangHoa kq = new DanhSachHangHoa();
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa instanceof HangThucPham)
				kq.them(hangHoa);
		}
		return kq;
	}
	// Tra ve danh sach hang dien may
	public DanhSachHangHoa hangDienMay() {
		DanhSachHangHoa kq = new DanhSachHangHoa();
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa instanceof HangDienMay)
				kq.them(hangHoa);
		}
		return kq;
	}
	// Tra ve danh sach hang sanh su
	public DanhSachHangHoa hangSanhSu() {
		DanhSachHangHoa kq = new DanhSachHangHoa();
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa instanceof HangSanhSu)
				kq.them(hangHoa);
		}
		return kq;
	}
	// Tim kiem theo ma
	public DanhSachHangHoa timKien(String maHang){
		DanhSachHangHoa temp = new DanhSachHangHoa();
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.getMaHang().equalsIgnoreCase(maHang))
				temp.them(hangHoa);
		}
		return temp;
	}
	// Sap xep theo ten
	public void sapXepTangDanTheoTen() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return o1.getTenHang().compareTo(o2.getTenHang());
			}
			
		});
	}
	// Xoa hang hoa khi biet ma
	public boolean xoaTheoMa(String ma) {	
		return dsHangHoa.removeIf(hh->hh.getMaHang() == ma);
	}
	// Sua thong tin don gia khi biet ma hang hoa
	public boolean suaThongTinHangHoa(String ma, double donGia) throws Exception {
		HangHoa hh = new HangHoa(ma, "", 0, 0) {
			
			@Override
			public double getThue() {
				return 0;
			}
			
			@Override
			public String danhGiaMucDoBanBuon() {
				return null;
			}
		};
		if(dsHangHoa.contains(hh)) {
			dsHangHoa.set(dsHangHoa.indexOf(hh), new HangHoa(ma, "", donGia, 0) {
				
				@Override
				public double getThue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public String danhGiaMucDoBanBuon() {
					// TODO Auto-generated method stub
					return null;
				}
			});
			return true;
		}
		return false;
	}

}
