/**
 * 
 */
package doHuyHoang.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class GiaoDichDat extends GiaoDichNhaDat {
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) throws Exception {
		if(loaiDat.equals("A") || loaiDat.equals("B") || loaiDat.equals("C"))
			this.loaiDat = loaiDat;
		else {
			throw new Exception("Nhap A, B, C");
		}

	}

	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param loaiDat
	 * @param dienTich
	 * @throws Exception 
	 */
	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loaiDat, double dienTich) throws Exception {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiDat(loaiDat);
	}

	public double getThanhTien() {
		if(loaiDat.equals("A"))
			return super.getThanhTien();
		return super.getThanhTien() * 1.5;
	}
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %s", super.toString(), loaiDat, dFormat.format(getThanhTien()));
	}
	
}
