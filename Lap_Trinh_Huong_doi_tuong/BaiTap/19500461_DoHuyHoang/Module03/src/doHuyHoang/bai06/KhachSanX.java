/**
 * 
 */
package doHuyHoang.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Do-Huy-Hoang
 *
 */
public class KhachSanX {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private String maPhong;
	private double donGia;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) throws Exception {
		if(maHoaDon == null)
			throw new Exception("Not null");
		else
			this.maHoaDon = maHoaDon;
	}
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	public void setNgayHoaDon(LocalDate ngayHoaDon) throws Exception {
		if(ngayHoaDon.isAfter(LocalDate.now()))
			throw new Exception("Ngay hoa don khong duoc qua ngay hien tai\n");
		else
			this.ngayHoaDon = ngayHoaDon;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if(maPhong == null)
			this.maPhong = "xxx";
		else
			this.maPhong = maPhong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public KhachSanX() {
		
	}
	/**
	 * @param maHoaDon
	 * @param ngayHoaDon
	 * @param tenKhachHang
	 * @param maPhong
	 * @param donGia
	 * @throws Exception 
	 */
	public KhachSanX(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) throws Exception {
		setDonGia(donGia);
		setMaHoaDon(maHoaDon);
		setMaPhong(maPhong);
		setNgayHoaDon(ngayHoaDon);
		setTenKhachHang(tenKhachHang);
	}
	public double getThanhTien() {
		return donGia;
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-10s %-20s %-10s %-10s", maHoaDon, dFormatter.format(ngayHoaDon), tenKhachHang, maPhong, dFormat.format(donGia));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHoaDon == null) ? 0 : maHoaDon.hashCode());
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
		KhachSanX other = (KhachSanX) obj;
		if (maHoaDon == null) {
			if (other.maHoaDon != null)
				return false;
		} else if (!maHoaDon.equals(other.maHoaDon))
			return false;
		return true;
	}
	
}
