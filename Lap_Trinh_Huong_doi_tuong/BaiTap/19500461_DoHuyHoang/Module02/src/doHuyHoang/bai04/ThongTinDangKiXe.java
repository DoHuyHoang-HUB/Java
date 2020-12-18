package doHuyHoang.bai04;

public class ThongTinDangKiXe {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaixe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) throws Exception {
		if(dungTich >= 0)
			this.dungTich = dungTich;
		else
			throw new Exception("Nhap sai!");
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) throws Exception {
		if(triGia >= 0)
			this.triGia = triGia;
		else
			throw new Exception("Nhap sai!");
	}
	public ThongTinDangKiXe() {
		
	}
	public ThongTinDangKiXe(String tenChuXe, String loaiXe, int dungTich, double triGia) throws Exception {
		setDungTich(dungTich);
		setLoaixe(loaiXe);
		setTenChuXe(tenChuXe);
		setTriGia(triGia);
	}
	public double thue(int dungTich, double triGia) {
		double thue;
		if(dungTich < 100)
			thue = (triGia * 1) / 100;
		else {
			if(dungTich < 200)
				thue = (triGia * 3) / 100;
			else
				thue = (triGia * 5) / 100;
		}
		return thue;
	}
	public static String e() {
		return String.format("%-20s%-15s%-10s%-15s%-15s", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
	}
	public String toString() {
		return String.format("%-20s%-15s%-10d%-15.2f%-15.2f\n", tenChuXe, loaiXe, dungTich, triGia, thue(dungTich, triGia));
	}
}
