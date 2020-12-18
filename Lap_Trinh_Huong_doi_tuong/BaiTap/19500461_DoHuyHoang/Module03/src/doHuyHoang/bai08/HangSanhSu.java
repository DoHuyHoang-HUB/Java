/**
 * 
 */
package doHuyHoang.bai08;

import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class HangSanhSu extends HangHoa {
	private LocalDate ngaySanXuat;
	private LocalDate ngayNhapKho;
	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @param ngaySanXuat
	 * @param ngayNhapKho
	 * @throws Exception
	 */
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, LocalDate ngaySanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNgayNhapKho(ngayNhapKho);
		setNgaySanXuat(ngaySanXuat);
	}
	
	@Override
	public double getThue() {
		return 0.1;
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
			return null;
	}
	
	@Override
	public String toString() {
		return "HangSanhSu [ngaySanXuat=" + ngaySanXuat + ", ngayNhapKho=" + ngayNhapKho + "Don gia" + super.getDonGia() + "]";
	}
	
	
}
