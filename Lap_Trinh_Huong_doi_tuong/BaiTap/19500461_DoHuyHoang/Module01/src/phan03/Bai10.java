package phan03;
/**
 * 10.   Viết hàm tách chuỗi gốc thành chuỗi con. 
VD: chuỗi gốc S = “Bai Tap Mon Lap Trinh Java”, chuỗi sau khi tách là 
“Bai 
Tap
Mon
Lap
Trinh
Java” 
* @author DoHuyHoang
 */
import java.util.Scanner;

public class Bai10 {

	public static int demTu(String str) {
        int dem = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                dem++;
            }
        }
        return dem;
    }

    public static String[] inTu(String str) {
        int j = 0;
        String[] strArray = new String[demTu(str)];
        strArray[j] = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                strArray[j] = strArray[j].concat("" + str.charAt(i));
            }

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                j++;
                strArray[j] = "";
            }

        }

        return strArray;

    }

    public static void main(String[] args) {
    	System.out.println("Nhap chuoi: ");
    	Scanner nhap = new Scanner(System.in);
        String chuoi = nhap.nextLine();
        nhap.close();
        chuoi = chuoi.trim();
        for (String string : inTu(chuoi)) {
            System.out.println(string);
        }

    }

}
