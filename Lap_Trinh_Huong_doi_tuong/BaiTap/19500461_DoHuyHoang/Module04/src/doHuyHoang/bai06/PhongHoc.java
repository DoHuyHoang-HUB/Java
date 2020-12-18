/**
 * 
 */
package doHuyHoang.bai06;

/**
 * @author Do-Huy-Hoang
 *
 */
public class PhongHoc {
	private String maPhong;
	private String dayNha;
	private float dienTich;
	private int soBongDen;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	/**
	 * @param maPhong
	 * @param dayNha
	 * @param dienTich
	 * @param soBongDen
	 */
	public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
		super();
		setDayNha(dayNha);
		setDienTich(dienTich);
		setMaPhong(maPhong);
		setSoBongDen(soBongDen);
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10.1f %-10d", maPhong, dayNha, dienTich, soBongDen);
	}
	public String getDanhGia() {
		return null;
	}
	public boolean kiemTraBongDen() {
		if((soBongDen / dienTich) == 10)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equals(other.maPhong))
			return false;
		return true;
	}
	
	
}

