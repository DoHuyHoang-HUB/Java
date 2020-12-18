/**
 * 
 */
package baiTapOOP;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DanhSach list = new DanhSach();
		
		list.them(new Sach("1", "Hello My friend", true, 100));
		list.them(new Sach("2", "BOloBO", false, 1000));
		list.them(new DiaCD("3", "HA HA...", false, 130));
		list.them(new DiaCD("4", ":))))))", true, 190));
		
		System.out.println(list);
		
		list.Xoa("1");
		
		System.out.println(list);
		
		list.suaDiaCD("2", "Hello hoang hot boy", true, 200);
		
		System.out.println(list);
		
		System.out.println("So luong an pham qua lon: " + list.demSoluongAnPhamQuaLon());
		
		System.out.println("An pham khon hop phap:\n" + list.AnPhamKhongHopPhap());
		
		System.out.println(list.timKiem("Hello hoang hot boy"));
		
		System.out.println("So trang lon nhat: " + list.laySoTrangLonNhat());
	}

}
