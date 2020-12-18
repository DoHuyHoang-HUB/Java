package doHuyHoang.bai09;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private double laiSuat;
	private int soThangGoi;
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		String tienLai = df.format(tinhTienLai());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ngayMoSo1 = dtf.format(ngayMoSo);
		return String.format("%s-ngay mo %s ky han %d thang, lai suat %.3f - So thang goi: %d; Tien lai: %s\n", maSo, ngayMoSo1, kyHan, laiSuat, soThangGoi, tienLai);
	}
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, double laiSuat, int soThangGoi) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGoi(soTienGoi);
		setKyHan(kyHan);
		setLaiSuat(laiSuat);
		setSoThangGoi(soThangGoi);
	}
	public int tinhSoThangGoiThuc() {
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int months = age.getMonths();
		return months;
	}
	public double tinhTienLai() {
		int soThang = tinhSoThangGoiThuc();
		double tienLai = 0;
		if(soThang % kyHan == 0)
			tienLai = soTienGoi * laiSuat * soThang;
		else
		{
			soThang = soThang - soThang % kyHan;
			tienLai = soTienGoi * laiSuat * soThang;
		}
		return tienLai;
				
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}
	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}
	public double getSoTienGoi() {
		return soTienGoi;
	}
	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	public double getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}
	public int getSoThangGoi() {
		return soThangGoi;
	}
	public void setSoThangGoi(int soThangGoi) {
		this.soThangGoi = soThangGoi;
	}
	
}
