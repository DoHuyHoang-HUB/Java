/**
 * 
 */
package doHuyHoang.bai08;

/**
 * @author Do-Huy-Hoang
 *
 */
public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;
	public String getMaHang() {
		return maHang;
	}
	private void setMaHang(String maHang) throws Exception {
		if(maHang.equals(""))
			throw new Exception("Ma hang khong duoc de trong!");
		else
			this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang.equals(""))
			this.tenHang = "xxx";
		else
			this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia >= 0)
			this.donGia = donGia;
		else
			throw new Exception("Don hang phai lon hon 0!");
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception {
		if(soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			throw new Exception("So luong ton phai lon hon 0!");
	}
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @throws Exception 
	 */
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		setDonGia(donGia);
		setMaHang(maHang);
		setSoLuongTon(soLuongTon);
		setTenHang(tenHang);
	}
	public HangHoa() {
		
	}
	
	@Override
	public String toString() {
		return "HangHoa [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", soLuongTon="
				+ soLuongTon + "]";
	}
	
	public abstract double getThue(); 
	public abstract String danhGiaMucDoBanBuon();		
}
