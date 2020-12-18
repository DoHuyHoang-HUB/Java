 package doHuyHoang.bai01;

public class ChuyenXe {
	private String maChuyenXe, hoTenTaiXe, soXe;
	private double doanhThu;
	public String getMaChuyenXe() {
		return maChuyenXe;
	}
	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public ChuyenXe() {
		
	}
	public ChuyenXe(String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
		setMaChuyenXe(maChuyenXe);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
	}
	@Override
	public String toString() {
		return "ChuyenXe [maChuyenXe=" + maChuyenXe + ", hoTenTaiXe=" + hoTenTaiXe + ", soXe=" + soXe + ", doanhThu="
				+ doanhThu + "]";
	}
	
}
