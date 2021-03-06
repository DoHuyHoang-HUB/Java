/**
 * 
 */
package baiThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author DoHuyHoang
 *
 */
public class DanhSachThe {
	private List<TaiKhoanThe> ds;

	/**
	 * @param
	 */
	public DanhSachThe() {
		ds = new ArrayList<TaiKhoanThe>();
	}
	
	public boolean addThe(TaiKhoanThe p) {
		if(ds.contains(p))
			return false;
		ds.add(p);
		return true;
	}

	@Override
	public String toString() {
		String s = "";
		for (TaiKhoanThe taiKhoanThe : ds) {
			s += taiKhoanThe + "\n";
		}
		return s;
	}
	
	public DanhSachThe timKienTheoTen(String ten) {
		DanhSachThe kq = new DanhSachThe();
		for (TaiKhoanThe taiKhoanThe : ds) {
			if(taiKhoanThe.getChuSoHuu().toLowerCase().contains(ten.toLowerCase()))
				kq.addThe(taiKhoanThe);
		}
		return kq;
	}
	
	public boolean suaKiemTheoMa(int maThe, double mucTinDung) {
		for (TaiKhoanThe taiKhoanThe : ds) {
			if(taiKhoanThe instanceof TheTinDung)
				if(taiKhoanThe.getMaThe() == maThe) {
					((TheTinDung) taiKhoanThe).setHanTinDung(mucTinDung);
					return true;
				}
		}
		return false;
	}
	
	public void sapXepDanhSach() {
		Collections.sort(ds, new Comparator<TaiKhoanThe>() {

			@Override
			public int compare(TaiKhoanThe o1, TaiKhoanThe o2) {
				return Integer.compare(o2.getMaThe(), o1.getMaThe());
			}
		});
	}
	
	
}
