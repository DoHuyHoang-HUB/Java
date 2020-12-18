package doHuyHoang.bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private float soNgayDiDuoc;
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public ChuyenXeNgoaiThanh(String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			float soNgayDiDuoc) {
		super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	@Override
	public String toString() {
		return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + "]";
	}
	
}
