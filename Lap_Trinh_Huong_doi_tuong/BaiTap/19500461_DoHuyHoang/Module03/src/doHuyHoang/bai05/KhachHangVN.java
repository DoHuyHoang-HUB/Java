/**
 * 
 */
package doHuyHoang.bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class KhachHangVN extends KhachHang {
	private String doiTuongKhachHang;
	private int dinhMuc;
	public String getDoiTuongKhachHang() {
		return doiTuongKhachHang;
	}
	public void setDoiTuongKhachHang(String doiTuongKhachHang) {
		this.doiTuongKhachHang = doiTuongKhachHang;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	/**
	 * @param maKhachHang
	 * @param hoTen
	 * @param ngayLapHoaDon
	 * @param soKW
	 * @param donGia
	 * @param doiTuongKhachHang
	 * @param dinhMuc
	 */
	public KhachHangVN(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia,
			String doiTuongKhachHang, int dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		setDinhMuc(dinhMuc);
		setDoiTuongKhachHang(doiTuongKhachHang);
	}
	
	public double getThanhTien() {
		if(super.getSoKW() <= dinhMuc)
			return super.getThanhTien();
		return super.getThanhTien() * dinhMuc + (super.getSoKW() - dinhMuc) * super.getDonGia() * 2.5; 
	}
	
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10d %-10s", super.toString(), doiTuongKhachHang, dinhMuc, decimalFormat.format(getThanhTien()));
	}
	
}
