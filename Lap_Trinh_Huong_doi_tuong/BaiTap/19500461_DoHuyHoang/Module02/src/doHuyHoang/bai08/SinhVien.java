package doHuyHoang.bai08;

public class SinhVien {
	private String maSV;
	private String hoTen;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public SinhVien() {
		
	}
	public SinhVien(String maSV, String hoTen) {
		setMaSV(maSV);
		setHoTen(hoTen);
	}
	@Override
	public String toString() {
		return String.format("\t%s  |  %s", maSV, hoTen);
	}
	
}
