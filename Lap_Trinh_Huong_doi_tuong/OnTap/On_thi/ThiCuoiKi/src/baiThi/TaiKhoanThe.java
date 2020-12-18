/**
 * 
 */
package baiThi;

/**
 * @author DoHuyHoang
 *
 */
public class TaiKhoanThe {
	private int maThe;
	private String chuSoHuu;
	/**
	 * @return the maThe
	 */
	public int getMaThe() {
		return maThe;
	}
	/**
	 * @param maThe the maThe to set
	 */
	public void setMaThe(int maThe) {
		this.maThe = maThe;
	}
	/**
	 * @return the chuSoHuu
	 */
	public String getChuSoHuu() {
		return chuSoHuu;
	}
	/**
	 * @param chuSoHuu the chuSoHuu to set
	 */
	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}
	/**
	 * @param maThe
	 * @param chuSoHuu
	 */
	public TaiKhoanThe(int maThe, String chuSoHuu) {
		setChuSoHuu(chuSoHuu);
		setMaThe(maThe);
	}
	
	public String getKhaNang() {
		return "Khong con kha nang";
	}
	@Override
	public String toString() {
		return String.format("%-5s %-30s", maThe, chuSoHuu);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chuSoHuu == null) ? 0 : chuSoHuu.hashCode());
		result = prime * result + maThe;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoanThe other = (TaiKhoanThe) obj;
		if (chuSoHuu == null) {
			if (other.chuSoHuu != null)
				return false;
		} else if (!chuSoHuu.equals(other.chuSoHuu))
			return false;
		if (maThe != other.maThe)
			return false;
		return true;
	}
	

}
