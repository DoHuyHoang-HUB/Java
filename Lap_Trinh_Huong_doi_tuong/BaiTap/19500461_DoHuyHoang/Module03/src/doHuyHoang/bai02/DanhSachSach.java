package doHuyHoang.bai02;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {
	private List<Sach> dsSach;

	public DanhSachSach() {
		dsSach = new ArrayList<Sach>();
	}

	public boolean them(Sach sach) {
		if (dsSach.contains(sach)) 
			return false;
		else {
			dsSach.add(sach);
			return true;
		}
	}

	@Override
	public String toString() {
		String s = "";

		for (Sach sach : dsSach) {
			s += sach + "\n";
		}

		return s;
	}
	// Tong tien sach giao khoa
	public double tinhTongThanhTienSGK() {
		double sum = 0;

		for (Sach sach : dsSach) {
			if(sach instanceof SachGiaoKhoa)
				sum += sach.getThanhTien();
		}

		return sum;
	}
	// Tong tien STk
	public double tinhTongThanhTienSTK() {
		double sum = 0;

		for (Sach sach : dsSach) {
			if(sach instanceof SachThamKhao)
				sum += sach.getThanhTien();
		}

		return sum;
	}
	// Tra ve danh sach sach giao khoa
	public DanhSachSach xuatSGK() {
		DanhSachSach kq = new DanhSachSach();
		for (Sach sach : dsSach) {
			if(sach instanceof SachGiaoKhoa)
				kq.them(sach);
		}
		return kq;
	}
	// Tra ve danh sach sach tham khao
	public DanhSachSach xuatSTK() {
		DanhSachSach kq = new DanhSachSach();
		for (Sach sach : dsSach) {
			if(sach instanceof SachThamKhao)
				kq.them(sach);
		}
		return kq;
	}
	// Tinh trung binh cong don gia cua cac sach tham khao
	public double tinhTrungBinhCongDonGiaSTK() {
		double s = 0;
		int soluong = 0;
		for (Sach sach : dsSach) {
			if(sach instanceof SachThamKhao) {
				s += sach.getDonGia();
				soluong++;
			}
		}
		return s / soluong;
				
	}
	// Xuat ra cac sach giao khoa cua nha xuat ban k
	public DanhSachSach xuatDSSachNhaXuatBanK(String name) {
//		String s = "";
//		for (Sach sach : dsSach) {
//			if (sach instanceof SachGiaoKhoa)
//				if(sach.getNhaXuatBan().toLowerCase().contains(name.toLowerCase()))
//					s += sach.toString() + "\n";
//
//		}
//		return SachGiaoKhoa.getTieuDeSGK() + "\n" + s;
		
		DanhSachSach kq = new DanhSachSach();
		for (Sach sach : dsSach) {
			if(sach instanceof SachGiaoKhoa)
				if(sach.getNhaXuatBan().toLowerCase().contains(name.toLowerCase()))
					kq.them(sach);
				
		}
		return kq;
	}
}
