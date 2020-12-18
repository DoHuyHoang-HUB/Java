package doHuyHoang.bai10;

public class CDList {
	private DoiTuongCD[] ds;
	private int soLuong;
	public void themCDVaoDanhSach(int maCD, String tuaCD, int soBaiHat, float giaThanh) throws Exception {
		ds[soLuong++] = new DoiTuongCD(maCD, tuaCD, soBaiHat, giaThanh);
	}
	
	public void themCDVaoDanhSach(DoiTuongCD p) {
		ds[soLuong++] = p;
	}
	
	public int soLuong() {
		return soLuong;
	}
	
	public CDList(int n) {
		soLuong = 0;
		ds = new DoiTuongCD[n];
	}
	
	public float tongGiaThanh() {
		float tongGiaThanh = 0;
		for(int i = 0; i < soLuong; i++) {
			tongGiaThanh += ds[i].getGiaThanh();
		}
		return tongGiaThanh;
	}
	
	public String toString() {
		String CDString = "";
		for(int i = 0; i < soLuong; i++) {
			CDString += ds[i].toString() + "\n";
		}
		return String.format("%s\n%s", hoang(), CDString);
	}
	public String hoang() {
		return String.format("|%-10s|%-10s|%-10s|%-10s|", "maCD", "Tua CD", "So Bai hat", "Gia thanh");
	}
	public String timKiem(int n) {
		for(int i = 0; i < soLuong; i++) {
			if(ds[i].getMaCD() == n)
				return String.format("%s", ds[i].toString());
		}
		return "Khong tim thay";
	}
	public void sapXepGiamDan() {
		for(int i = 0; i < soLuong - 1; i++) {
			for(int j = i + 1; j < soLuong; j++) {
				if(ds[i].getGiaThanh() < ds[j].getGiaThanh()) {
					DoiTuongCD a = ds[i];
					ds[i] = ds[j];
					ds[j] = a;
				}
					
			}
		}
	}
	public void sapXepTangDan() {
		for(int i = 0; i < soLuong - 1; i++) {
			for(int j = i + 1; j < soLuong; j++) {
				if(ds[i].getTuaCD().compareTo(ds[j].getTuaCD()) > 0) {
					DoiTuongCD a = ds[i];
					ds[i] = ds[j];
					ds[j] = a;
				}
					
			}
		}
	}
	
}
