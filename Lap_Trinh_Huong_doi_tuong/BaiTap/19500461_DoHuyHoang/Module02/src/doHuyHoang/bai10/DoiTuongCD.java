package doHuyHoang.bai10;

public class DoiTuongCD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private float giaThanh;
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD > 0)
			this.maCD = maCD;
		else
			this.maCD = 999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.equals(""))
			this.tuaCD = tuaCD;
		else
			this.tuaCD = "Chua xac dinh";
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) throws Exception {
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
		else
			throw new Exception("Nhap lai!");
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(float giaThanh) throws Exception {
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
		else
			throw new Exception("Nhap sai!");
	}
	public DoiTuongCD() {
		
	}
	public DoiTuongCD(int maCD, String tuaCD, int soBaiHat, float giaThanh) throws Exception {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}
	@Override
	public String toString() {
		return String.format("|%-10d|%-10s|%-10d|%-10.1f|", maCD, tuaCD, soBaiHat, giaThanh);
	}
	
}
