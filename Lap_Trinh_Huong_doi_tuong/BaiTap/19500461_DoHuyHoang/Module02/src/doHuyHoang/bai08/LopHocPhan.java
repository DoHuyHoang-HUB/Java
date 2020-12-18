package doHuyHoang.bai08;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dSSV;
	private int soLuongSinhVien;
	public String getMaLHP() {
		return maLHP;
	}
	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}
	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc = thongTinLopHoc;
	}
	public SinhVien[] getdSSV() {
		return dSSV;
	}
	public void setdSSV(SinhVien[] dSSV) {
		this.dSSV = dSSV;
	}
	public LopHocPhan() {
		
	}
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, int n) {
		setMaLHP(maLHP);
		setTenGV(tenGV);
		setTenLHP(tenLHP);
		setThongTinLopHoc(thongTinLopHoc);
		soLuongSinhVien = 0;
		dSSV = new SinhVien[n];
		
	}
	public void addDSSV(String maSV, String hoTen) {
		dSSV[soLuongSinhVien++] = new SinhVien(maSV, hoTen);
	}
	public void addDSSV(SinhVien p) {
		dSSV[soLuongSinhVien++] = p;
	}
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < soLuongSinhVien; i++ ) {
			s += dSSV[i].toString() + "\n";
		}
		return String.format("- Ma LHP: %s\n- Ten LHP: %s\n- GV giang day: %s\n- Thong tin buoi hoc: %s\n\nDanh sach sinh vien\n%sTong so sinh vien: %d", maLHP, tenLHP, tenGV, thongTinLopHoc, s, soLuongSinhVien);
	}
	
}
