/**
 * 
 */
package doHuyHoang.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Do-Huy-Hoang
 *
 */
public class GiaoDichNhaDat {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double dienTich;
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 */
	public GiaoDichNhaDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		setDienTich(dienTich);
		setDonGia(donGia);
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
	}
	
	public GiaoDichNhaDat() {
		
	}
	
	public double getThanhTien() {
		return dienTich * donGia;
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-10s %-10s %-10.2f", maGiaoDich, dateTimeFormatter.format(ngayGiaoDich), dFormat.format(donGia), dienTich);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maGiaoDich == null) ? 0 : maGiaoDich.hashCode());
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
		GiaoDichNhaDat other = (GiaoDichNhaDat) obj;
		if (maGiaoDich == null) {
			if (other.maGiaoDich != null)
				return false;
		} else if (!maGiaoDich.equals(other.maGiaoDich))
			return false;
		return true;
	}
	
}
