/**
 * 
 */
package baiTapOOP;

/**
 * @author Do-Huy-Hoang
 *
 */
public class NhaXuatBan {
	private String ma;
	private String tuaDe;
	private boolean tinhTrang;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTuaDe() {
		return tuaDe;
	}
	public void setTuaDe(String tuaDe) {
		this.tuaDe = tuaDe;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	/**
	 * @param ma
	 * @param tuaDe
	 * @param tinhTrang
	 */
	public NhaXuatBan(String ma, String tuaDe, boolean tinhTrang) {
		setMa(ma);
		setTinhTrang(tinhTrang);
		setTuaDe(tuaDe);
	}
	public NhaXuatBan() {
		
	}
	public boolean getTheoDoiTinhTrang() {
		return false;
	}
	public boolean getTheoDoiHopPhap() {
		if(tinhTrang == true)
			return true;
		return false;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s", ma, tuaDe, tinhTrang);
	}
	
	
}
