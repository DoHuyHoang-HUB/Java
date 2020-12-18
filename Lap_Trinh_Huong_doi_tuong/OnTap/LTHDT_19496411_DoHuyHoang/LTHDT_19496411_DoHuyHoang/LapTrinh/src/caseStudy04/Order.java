package caseStudy04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail lineItems[];
	private int count;
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public OrderDetail[] getLineItems() {
		return lineItems;
	}
	public Order(int orderID, LocalDate orderDate) {
		setOrderDate(orderDate);
	}
	public void addLineItem(Product product, int quatily) {
		lineItems[count++] = new OrderDetail(quatily, product);
	}
	public double e(OrderDetail p, Product product, int quatily) {
		double e = 0;
		e = p.calcTotalPrice(product, quatily);
		return e;
	}
	public double calcTotalCharnge(OrderDetail p, Product product, int quatily) {
		double s = 0;
		for(int i = 0; i < count; i++)
			s += e(p, product, quatily);
		return s;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String orderDate1 = dtf.format(orderDate);
		return String.format("OrderID = %d, orderDate = %s, lineItem = %s", orderID, orderDate1,  );
	}
	
}
