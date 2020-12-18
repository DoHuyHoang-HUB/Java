package doHuyHoang.bai09;

import java.time.LocalDate;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSo;
	public void setSoLuongSo(int soLuongSo) {
		this.soLuongSo = soLuongSo;
	}
	public KhachHang(String maKH, String hoTenKH,int n) {
		setMaKH(maKH);
		setHoTenKH(hoTenKH);
		dsSoTietKiem = new SoTietKiem[n];
		soLuongSo = 0;
		
	}
	public void themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat, int soThangGoi) {
		dsSoTietKiem[soLuongSo++] = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat, soThangGoi); 
	}
	public void themSoTietKiem(SoTietKiem p) {
		dsSoTietKiem[soLuongSo++] = p;
	}
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < soLuongSo; i++)
		{
			s += dsSoTietKiem[i].toString();
		}
		return String.format("Khach hang: %s - %s\n%s", maKH, hoTenKH, s);
	}
	public String getHoTenKH() { 
		return hoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}
	public String getMaKH() {
		return maKH;
	}
	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}
	public int getSoLuongSo() {
		return soLuongSo;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	
}
