package caseStudy04;

public class OrderDetail {
	private int quatily;
	private Product product;
	public int getQuatily() {
		return quatily;
	}
	public void setQuatily(int quatily) {
		this.quatily = quatily;
	}
	public OrderDetail(int quatily, Product product) {
		setQuatily(quatily);
	}
	public double calcTotalPrice(Product product, int quatily) {
		double thanhTien = 0;
		thanhTien = product.getPrice() * quatily;
		return thanhTien;
	}
	@Override
	public String toString() {
		return String.format("S luong: %d\nthanh tien: %f", quatily, calcTotalPrice(product, quatily));
	}
}

