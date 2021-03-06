/**
 * 
 */
package baiTapOOP;

/**
 * @author Do-Huy-Hoang
 *
 */
public class DiaCD extends NhaXuatBan {
	private int thoiGian;

	public int getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(int thoiGian) {
		this.thoiGian = thoiGian;
	}

	/**
	 * @param ma
	 * @param tuaDe
	 * @param tinhTrang
	 * @param thoiGian
	 */
	public DiaCD(String ma, String tuaDe, boolean tinhTrang, int thoiGian) {
		super(ma, tuaDe, tinhTrang);
		setThoiGian(thoiGian);
	}
	
	/* (non-Javadoc)
	 * @see baiTapOOP.NhaXuatBan#getTheoDoiTinhTrang()
	 */
	@Override
	public boolean getTheoDoiTinhTrang() {
		if(thoiGian >= 180)
			return true;
		return false;
	}
	
	/* (non-Javadoc)
	 * @see baiTapOOP.NhaXuatBan#getTheoDoiHopPhap()
	 */
	@Override
	public boolean getTheoDoiHopPhap() {
		return super.getTheoDoiHopPhap();
	}

	@Override
	public String toString() {
		return String.format("%s %-10d %-10s %-10s", super.toString(), thoiGian, getTheoDoiTinhTrang(), getTheoDoiHopPhap());
	}
			
	
}
