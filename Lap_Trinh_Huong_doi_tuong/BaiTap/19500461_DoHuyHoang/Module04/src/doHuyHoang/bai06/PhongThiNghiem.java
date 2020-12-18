/**
 * 
 */
package doHuyHoang.bai06;

/**
 * @author Do-Huy-Hoang
 *
 */
public class PhongThiNghiem extends PhongHoc {
	private String thongTinChuyenNganh;
	private int sucChua;
	private boolean bonRua;
	public String getThongTinChuyenNganh() {
		return thongTinChuyenNganh;
	}
	public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
		this.thongTinChuyenNganh = thongTinChuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isBonRua() {
		return bonRua;
	}
	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	/**
	 * @param maPhong
	 * @param dayNha
	 * @param dienTich
	 * @param soBongDen
	 * @param thongTinChuyenNganh
	 * @param sucChua
	 * @param bonRua
	 */
	public PhongThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String thongTinChuyenNganh,
			int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setBonRua(bonRua);
		setSucChua(sucChua);
		setThongTinChuyenNganh(thongTinChuyenNganh);
	}
	
	@Override
	public String getDanhGia() {
		if(super.kiemTraBongDen() == true && bonRua == true)
			return "Dat chuan";
		return "Khong dat chuan";
	}
	
	@Override
	public String toString() {
		return String.format("%s %-20s %-10d %-10s %s", super.toString(), thongTinChuyenNganh, sucChua, bonRua, getDanhGia());
	}
	
}
