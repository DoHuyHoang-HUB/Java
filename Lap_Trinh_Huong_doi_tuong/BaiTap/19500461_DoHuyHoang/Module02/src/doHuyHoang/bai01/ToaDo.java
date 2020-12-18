package doHuyHoang.bai01;

public class ToaDo {
	private float toaDoX;
	private float toaDoY;
	private String tenToaDo;
	public float getToaDoX() {
		return toaDoX;
	}
	public void setToaDoX(float toaDoX) {
		this.toaDoX = toaDoX;
	}
	public float getToaDoY() {
		return toaDoY;
	}
	public void setToaDoY(float toaDoY) {
		this.toaDoY = toaDoY;
	}
	public String getTenToaDo() {
		return tenToaDo;
	}
	public void setTenToaDo(String tenToaDo) {
		this.tenToaDo = tenToaDo;
	}
	public ToaDo() {
		
	}
	public ToaDo(float toaDoX, float toaDoY, String tenToaDo) {
		setToaDoX(toaDoX);
		setToaDoY(toaDoY);
		setTenToaDo(tenToaDo);
	}
	public String toString() {
		return String.format("%s(%.1f, %.1f)", tenToaDo, toaDoX, toaDoY);
	}
}
