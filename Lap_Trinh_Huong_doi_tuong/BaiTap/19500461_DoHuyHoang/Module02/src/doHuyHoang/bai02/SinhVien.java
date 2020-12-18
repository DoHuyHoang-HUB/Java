package doHuyHoang.bai02;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) throws Exception {
		if(maSinhVien > 0)
			this.maSinhVien = maSinhVien;
		else
			throw new Exception("Ma sinh vien phai lon hon 0");
	}
	public String gethoTen(){
		return hoTen;
	}
	public void setHoTen(String hoTen) throws Exception {
		if(!(hoTen == " "))
			this.hoTen = hoTen;
		else 
			throw new Exception("Khong duoc de rong!");
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) throws Exception {
		if(diemLT >= 0 && diemLT <= 10)
			this.diemLT = diemLT;
		else
			throw new Exception("Dieu kien (so thuc, thuoc[0.0, 10.0]). Nhap lai!");
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) throws Exception {
		if(diemTH >= 0 && diemTH <= 10)
			this.diemTH = diemTH;
		else
			throw new Exception("Dieu kien (so thuc, thuoc[0.0, 10.0]). Nhap lai!");
	}
	public SinhVien() {
		
	}
	public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) throws Exception {
		setMaSinhVien(maSinhVien);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	public float diemTrungBinh(float diemLT, float diemTH) {
		float diemTrungBinh = 0;
		diemTrungBinh = (diemLT + diemTH) / 2;
		return diemTrungBinh;
	}
	public  String toString() {
		return String.format("%-10d%-20s%-10.1f%-10.1f%-10.1f", maSinhVien, hoTen, diemLT, diemTH, diemTrungBinh(diemLT, diemTH));
	}
}
