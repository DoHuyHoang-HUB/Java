/**
 * 
 */
package doHuyHoang.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param soLuong
	 * @param loaiVang
	 */
	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiVang(loaiVang);
	}
	public double thanhTien() {
		return super.thanhTien();
	}
	public static String getTieuDeGDVang() {
		return String.format("%-5s %-15s %-15s %-10s %-10s %s", "Ma sach", "Ngay giao dich", "Don gia", "So luong", "Loai vang", "Thanh tien");
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0 VND");
		return String.format("%s %-10s %s", super.toString(), loaiVang, dFormat.format(thanhTien()));
	}
}
