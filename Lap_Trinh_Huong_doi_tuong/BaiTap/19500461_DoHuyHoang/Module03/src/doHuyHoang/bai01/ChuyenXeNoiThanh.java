package doHuyHoang.bai01;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private String soTuyen;
	private double soKmDiDuoc;
	public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	public void setSoKmDiDuoc(double soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}
	public ChuyenXeNoiThanh(String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen,
			double soKmDiDuoc) {
		super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
		setSoKmDiDuoc(soKmDiDuoc);
		setSoTuyen(soTuyen);
	}
	@Override
	public String toString() {
		return "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKmDiDuoc=" + soKmDiDuoc + "]";
	}
}
