/**
 * 
 */
package doHuyHoang.bai06;

/**
 * @author Do-Huy-Hoang
 *
 */
public class PhongHocLyThuyet extends PhongHoc {
	private boolean mayChieu;

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	/**
	 * @param maPhong
	 * @param dayNha
	 * @param dienTich
	 * @param soBongDen
	 * @param mayChieu
	 */
	public PhongHocLyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setMayChieu(mayChieu);
	}
	
	@Override
	public String getDanhGia() {
		if(super.kiemTraBongDen() == true && mayChieu == true)
			return "Dat Chuan";
		return "Khong dat chuan";
	}
	
	@Override
	public String toString() {
		return String.format("%s %-10s %-10s", super.toString(), mayChieu, getDanhGia());
	}
	
}
