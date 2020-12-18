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
public class GiaoDichNha extends GiaoDichNhaDat {
	private String loaiNha;
	private String diaChi;
	
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) throws Exception {
		if(loaiNha.equals("Thuong") || loaiNha.equals("Cao cap"))
			this.loaiNha = loaiNha;
		else {
			throw new Exception("Nhap thuong hoac cao cap");
		}
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param dienTich
	 * @param loaiNha
	 * @param diaChi
	 * @throws Exception 
	 */
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) throws Exception {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiNha(loaiNha);
		setDiaChi(diaChi);
	}
	
	public double getThanhTien() {
		if(loaiNha.equals("Cao cap"))
			return super.getThanhTien();
		return super.getThanhTien() * 0.9;
	}
	
	@Override
	public String toString() {
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		return String.format("%s %-10s %-20s %-10s", super.toString(), loaiNha, dFormat.format(getThanhTien()), diaChi);
	}
	
}
