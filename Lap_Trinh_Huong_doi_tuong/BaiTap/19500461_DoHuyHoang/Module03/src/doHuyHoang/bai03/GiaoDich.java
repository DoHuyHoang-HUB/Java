package doHuyHoang.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;
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
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public GiaoDich() {
		
	}
	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param soLuong
	 */
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, int soLuong) {
		setDonGia(donGia);
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setSoLuong(soLuong);
	}
	public double thanhTien()
	{
		return soLuong * donGia;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-5s%-15s%-15s%-10d", maGiaoDich, dtf.format(ngayGiaoDich), df.format(donGia), soLuong);
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
		GiaoDich other = (GiaoDich) obj;
		if (maGiaoDich == null) {
			if (other.maGiaoDich != null)
				return false;
		} else if (!maGiaoDich.equals(other.maGiaoDich))
			return false;
		return true;
	}
	
	
}
