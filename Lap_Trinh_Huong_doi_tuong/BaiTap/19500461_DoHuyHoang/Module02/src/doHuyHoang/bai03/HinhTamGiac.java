package doHuyHoang.bai03;

public class HinhTamGiac {
	private int ma;
	private int mb;
	private int mc;
	public HinhTamGiac() {
		
	}
	public HinhTamGiac(int ma, int mb, int mc) {
		this();
		if(kiemTraTamGiac(ma, mb, mc) && ma > 0 && mb > 0 && mc > 0) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
		else {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
			
	}
	public float getMA() {
		return ma;
	}
	public void setMA(int ma) {
		if(kiemTraTamGiac(ma, this.mb, this.mc) && ma > 0)
			this.ma = ma;
		else
			return;
	}
	public float getMB() {
		return mb;
	}
	public void setMB(int mb) {
		if(kiemTraTamGiac(this.ma, mb, this.mc) && mb > 0)
			this.mb = mb;
		else
			return;
	}
	public float getMC() {
		return mc;
	}
	public void setMC(int mc) {
		if(kiemTraTamGiac(this.ma, this.mb, mc) && mc > 0)
			this.mc = mc;
		else
			return;
	}
	public int tinhChuVi(int ma, int mb, int mc) {
		int chuVi = 0;
		chuVi = (ma + mb + mc) / 2;
		return chuVi;
	}
	public float tinhDienTich(int ma, int mb, int mc) {
		float dienTich = 0;
		dienTich = (float) Math.sqrt(tinhChuVi(ma, mb, mc) * (tinhChuVi(ma, mb, mc) - ma) * (tinhChuVi(ma, mb, mc) - mb) * (tinhChuVi(ma, mb, mc) - mc));
		return dienTich;
	}
	public boolean kiemTraTamGiac(int a, int b, int c) {
		if((a + b > c) && (a + c > b) && (b + c > a))
			return true;
		else
			return false;
	}
	public String kTTamGiac() {
		if(kiemTraTamGiac(this.ma, this.mb, this.mc)) {
			if(this.ma == this.mb || this.ma == this.mc || this.mb == this.mc) {
				if(this.ma == this.mb && this.ma == this.mc && this.mb == this.mc)
					return String.format("Tam giac deu");
				else
					return String.format("Tam giac can");
			}
			else
				return String.format("Tam giac thuong");
		}
		else
			return String.format("Khong phai tam giac");
	}
	public static String e() {
		return String.format("%-10s%-10s%-10s%-20s%-10s%-10s\n", "canh a", "canh b", "canh c", "Loai tam giac", "chu vi", "dien tich");
	}
	public String toString () {
		return String.format("%-10d%-10d%-10d%-20s%-10d%-10.1f ", ma, mb, mc, kTTamGiac(), tinhChuVi(ma, mb, mc), tinhDienTich(ma, mb, mc));
	}
}
