/**
 * 
 */
package baiThi;

import java.text.DecimalFormat;

/**
 * @author DoHuyHoang
 *
 */
public class TheTinDung extends TaiKhoanThe	{
	private double hanTinDung;
	private double tongTienChiTieu;
	/**
	 * @return the hanTinDung
	 */
	public double getHanTinDung() {
		return hanTinDung;
	}
	/**
	 * @param hanTinDung the hanTinDung to set
	 */
	public void setHanTinDung(double hanTinDung) {
		this.hanTinDung = hanTinDung;
	}
	/**
	 * @return the tongTienChiTieu
	 */
	public double getTongTienChiTieu() {
		return tongTienChiTieu;
	}
	/**
	 * @param tongTienChiTieu the tongTienChiTieu to set
	 */
	public void setTongTienChiTieu(double tongTienChiTieu) {
		this.tongTienChiTieu = tongTienChiTieu;
	}
	/**
	 * @param maThe
	 * @param chuSoHuu
	 * @param hanTinDung
	 * @param tongTienChiTieu
	 */
	public TheTinDung(int maThe, String chuSoHuu, double hanTinDung, double tongTienChiTieu) {
		super(maThe, chuSoHuu);
		setHanTinDung(hanTinDung);
		setTongTienChiTieu(tongTienChiTieu);
	}
	
	@Override
	public String getKhaNang() {
		if(tongTienChiTieu <= hanTinDung)
			return "Con";
		return super.getKhaNang();
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-10s %s", super.toString(), df.format(hanTinDung), df.format(tongTienChiTieu), getKhaNang());
	}
	
	
}
