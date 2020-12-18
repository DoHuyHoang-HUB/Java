/**
 * 
 */
package doHuyHoang.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class HoaDonTheoNgay extends KhachSanX {
	private int soNgayThue;

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	/**
	 * @param maHoaDon
	 * @param ngayHoaDon
	 * @param tenKhachHang
	 * @param maPhong
	 * @param donGia
	 * @param soNgayThue
	 * @throws Exception 
	 */
	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soNgayThue) throws Exception {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoNgayThue(soNgayThue);
	}
	public double getThanhTien() {
		if(soNgayThue > 7)
			return 7 * super.getThanhTien() + (soNgayThue - 7) * super.getThanhTien() * 0.2;
		return soNgayThue * super.getThanhTien();
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10d %-10s", super.toString(), soNgayThue, dFormat.format(getThanhTien()));
	}
}
