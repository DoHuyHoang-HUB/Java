/**
 * 
 */
package baiTapOOP;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Sach extends NhaXuatBan {
	private int soTrang;

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	/**
	 * @param ma
	 * @param tuaDe
	 * @param tinhTrang
	 * @param soTrang
	 */
	public Sach(String ma, String tuaDe, boolean tinhTrang, int soTrang) {
		super(ma, tuaDe, tinhTrang);
		setSoTrang(soTrang);
	}
	/* (non-Javadoc)
	 * @see baiTapOOP.NhaXuatBan#getTheoDoiTinhTrang()
	 */
	@Override
	public boolean getTheoDoiTinhTrang() {
		if(soTrang >= 999)
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
		return String.format("%s %-10s %-10s %s", super.toString(), soTrang, getTheoDoiTinhTrang(), getTheoDoiHopPhap());
	}
	
}
