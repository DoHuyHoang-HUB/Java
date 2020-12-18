/**
 * 
 */
package doHuyHoang.bai06;

/**
 * @author Do-Huy-Hoang
 *
 */
public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public int getsoMayTinh() {
		return soMayTinh;
	}

	public void setsoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	/**
	 * @param maPhong
	 * @param dayNha
	 * @param dienTich
	 * @param soBongDen
	 * @param soMayTinh
	 */
	public PhongMayTinh(String maPhong, String dayNha, float dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setsoMayTinh(soMayTinh);
	}
	
	@Override
	public String getDanhGia() {
		if(super.kiemTraBongDen() == true && (soMayTinh / super.getDienTich()) == 1.5)
			return "Dat Chuan";
		return "Khong dat chuan";
	}
	
	@Override
	public String toString() {
		return String.format("%s %-10d %-10s", super.toString(), soMayTinh, getDanhGia());
	}
}
