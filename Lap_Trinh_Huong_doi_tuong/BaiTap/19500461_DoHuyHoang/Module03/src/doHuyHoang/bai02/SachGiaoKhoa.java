package doHuyHoang.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public SachGiaoKhoa(String maSach, double donGia, LocalDate ngayNhap, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, donGia, ngayNhap, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public SachGiaoKhoa() {

	}

	@Override
	public double getThanhTien() {
		if (tinhTrang)
			return super.getThanhTien();
		else
			return super.getThanhTien() * 0.5;
	}
	
	public static String getTieuDeSGK() {
		return String.format("%-5s %10s %10s %10s %-15s %-10s %s", "Ma sach", "Ngay nhap", "Don gia", "So luong", "Nha xuat ban", "tinh trang", "Thanh tien");
	}
	@Override
	public String toString() {

		String tt = (tinhTrang == true) ? "moi" : "cu";
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %s", super.toString(), tt, dFormat.format(getThanhTien()));
	}
}
