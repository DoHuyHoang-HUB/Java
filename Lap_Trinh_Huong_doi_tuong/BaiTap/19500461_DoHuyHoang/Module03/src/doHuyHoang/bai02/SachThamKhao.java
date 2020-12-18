package doHuyHoang.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
public class SachThamKhao extends Sach {
	private double thue;
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	public SachThamKhao(String maSach, double donGia, LocalDate ngayNhap, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, donGia, ngayNhap, soLuong, nhaXuatBan);
		setThue(thue);
	}
	public SachThamKhao() {

	}
	@Override
	public double getThanhTien() {
		return super.getThanhTien() + thue;
	}
	public static String getTieuDeSTK() {
		return String.format("%-5s %10s %10s %10s %-15s %-10s %s", "Ma sach", "Ngay nhap", "Don gia", "So luong", "Nha xuat ban", "Thue", "Thanh tien");
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %-10s %s", super.toString(), df.format(thue), df.format(getThanhTien()));
	}
}
