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
public class HoaDonTheoGio extends KhachSanX {
	private int soGioThue;

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) throws Exception {
		if(soGioThue > 24 && soGioThue <= 30)
			this.soGioThue = 24;
		else if (soGioThue > 30)
			throw new Exception("Phat sinh ngoai le\n");
		else {
			this.soGioThue = soGioThue;
		}
	}

	/**
	 * @param maHoaDon
	 * @param ngayHoaDon
	 * @param tenKhachHang
	 * @param maPhong
	 * @param donGia
	 * @param soGioThue
	 * @throws Exception 
	 */
	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soGioThue) throws Exception {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoGioThue(soGioThue);
	}
	public double getThanhTien() {
		return soGioThue * super.getThanhTien();
	}

	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10d %-10s", super.toString(), soGioThue, dFormat.format(getThanhTien()));
	}
	
}
