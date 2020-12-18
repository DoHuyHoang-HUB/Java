/**
 * 
 */
package doHuyHoang.bai08;

import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @param nhaCungCap
	 * @param ngaySanXuat
	 * @param ngayHetHan
	 * @throws Exception
	 */
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	@Override
	public double getThue() {
		return 0.05;
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
		if(super.getSoLuongTon() > 0 && ngayHetHan.isAfter(LocalDate.now()))
				return "Kho ban";
		return "Khong danh gia";
	}
	
	@Override
	public String toString() {
		return "HangThucPham [nhaCungCap=" + nhaCungCap + ", ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan
				+ "]";
	}
	
	
}
