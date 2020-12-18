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
public class GiaoDichTienTe extends GiaoDich {
	private String loaiTien;
	private double tiGia;

	public String getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param soLuong
	 * @param loaiTien
	 */
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, int soLuong,double tiGia, String loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiTien(loaiTien);
		setTiGia(tiGia);
	}
	public double thanhTien() {
		if(loaiTien.equals("USD") || loaiTien.equals("Euro"))
			return super.thanhTien() * tiGia;
		return super.thanhTien();
	}
	public static String getTieuDeGDTienTe() {
		return String.format("%-5s %-15s %-15s %-10s %-10s %s", "Ma sach", "Ngay giao dich", "Don gia", "So luong", "Loai tien", "Thanh tien");
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0 VND");
		return String.format("%s %-10s %s", super.toString(), loaiTien, dFormat.format(thanhTien()));
	}
	
}
