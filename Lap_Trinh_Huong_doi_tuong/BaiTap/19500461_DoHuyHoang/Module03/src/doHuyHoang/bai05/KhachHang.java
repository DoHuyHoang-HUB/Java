/**
 * 
 */
package doHuyHoang.bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Do-Huy-Hoang
 *
 */
public class KhachHang {
	private String maKhachHang;
	private String hoTen;
	private LocalDate ngayLapHoaDon;
	private float soKW;
	private double donGia;
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public float getSoKW() {
		return soKW;
	}
	public void setSoKW(float soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	/**
	 * @param maKhachHang
	 * @param hoTen
	 * @param ngayLapHoaDon
	 * @param soKW
	 * @param donGia
	 */
	public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia) {
		setDonGia(donGia);
		setHoTen(hoTen);
		setMaKhachHang(maKhachHang);
		setNgayLapHoaDon(ngayLapHoaDon);
		setSoKW(soKW);
	}
	
	public KhachHang() {
		
	}
	
	public double getThanhTien() {
		return soKW * donGia;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat dfDecimalFormat = new DecimalFormat("#,##0");
		return String.format("%-10s %-25s %-15s %-10s %-10f", maKhachHang, hoTen, dateTimeFormatter.format(ngayLapHoaDon), dfDecimalFormat.format(donGia), soKW);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKhachHang == null) ? 0 : maKhachHang.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		if (maKhachHang == null) {
			if (other.maKhachHang != null)
				return false;
		} else if (!maKhachHang.equals(other.maKhachHang))
			return false;
		return true;
	}
	
	
}
