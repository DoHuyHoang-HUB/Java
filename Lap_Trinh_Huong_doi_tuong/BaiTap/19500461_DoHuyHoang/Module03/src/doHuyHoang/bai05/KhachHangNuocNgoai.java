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
public class KhachHangNuocNgoai extends KhachHang {
	private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	/**
	 * @param maKhachHang
	 * @param hoTen
	 * @param ngayLapHoaDon
	 * @param soKW
	 * @param donGia
	 * @param quocTich
	 */
	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia,
			String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		setQuocTich(quocTich);
	}

	public double getThanhTien() {
		return super.getThanhTien();
	}
	
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %s", super.toString(), quocTich, decimalFormat.format(getThanhTien()));
	}
	
}
