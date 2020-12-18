package doHuyHoang.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	private String maSach;
	private double donGia;
	private LocalDate ngayNhap;
	private int soLuong;
	private String nhaXuatBan;

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public Sach(String maSach, double donGia, LocalDate ngayNhap, int soLuong, String nhaXuatBan) {
		super();
		setMaSach(maSach);
		setDonGia(donGia);
		setNgayNhap(ngayNhap);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public Sach() {
		this("", 0, LocalDate.now(), 0, "");
	}

	public double getThanhTien() {
		return donGia * soLuong;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return String.format("%-5s %10s %10s %10s %-15s", maSach, dtf.format(ngayNhap), df.format(donGia), soLuong,
				nhaXuatBan);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSach == null) ? 0 : maSach.hashCode());
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
		Sach other = (Sach) obj;
		if (maSach == null) {
			if (other.maSach != null)
				return false;
		} else if (!maSach.equals(other.maSach))
			return false;
		return true;
	}

	
}
