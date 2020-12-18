/**
 * 
 */
package doHuyHoang.bai08;

/**
 * @author Do-Huy-Hoang
 *
 */
public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double congSuat;
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @param thoiGianBaoHanh
	 * @param congSuat
	 * @throws Exception
	 */
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh,
			double congSuat) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setCongSuat(congSuat);
		setThoiGianBaoHanh(thoiGianBaoHanh);
	}
	
	@Override
	public double getThue() {
		return 0.1;
	}
	
	@Override
	public String danhGiaMucDoBanBuon() {
		if(super.getSoLuongTon() < 3)
			return "Ban duoc";
		return "Khong danh gia";
	}
	
	@Override
	public String toString() {
		return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", congSuat=" + congSuat + "Don gia" + super.getDonGia() + "]";
	}
	
}
