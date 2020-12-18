package doHuyHoang.bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang.equals(""))
			this.tenHang = "xxx";
		else
			this.tenHang = tenHang;

	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia < 0)
			this.donGia = 0;
		else
			this.donGia = donGia;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(this.ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = this.ngaySanXuat;
	}

	public String getMaHang() {
		return maHang;
	}

	@SuppressWarnings("unused")
	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Loi: Ma hang rong!");

	}

	public HangThucPham(String maHang) {
		this.maHang = maHang;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		this.maHang = maHang;
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public boolean kiemTraHetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
	}
	public String hetHan() {
		if(kiemTraHetHan()==true)
			return String.format("Hang het han");
		else 
			return String.format("");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String donGia1 = df.format(donGia);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ngaySanXuat1 = dtf.format(ngaySanXuat);
		String ngayHetHan1 = dtf.format(ngayHetHan);
		return String.format("%10s %15s %20s %25s %25s %20s",this.maHang,this.tenHang,donGia1,ngaySanXuat1,ngayHetHan1,hetHan());
	}

}
