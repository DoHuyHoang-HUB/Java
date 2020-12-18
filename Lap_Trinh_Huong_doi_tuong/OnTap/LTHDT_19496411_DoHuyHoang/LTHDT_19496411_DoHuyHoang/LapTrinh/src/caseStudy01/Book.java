package caseStudy01;

public class Book {
	private String name;
	private Author authors[];
	private double price;
	private int qty = 0;
	public Book(String name, Author author, double price) {
		setPrice(price);
	}
	public Book(String name, Author author, double price, int qty) {
		setPrice(price);
		setQty(qty);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthor() {
		return authors;
	}
	@Override
	public String toString() {
		String authorString = "Author=!";
		for (Author au : authors) {
			authorString += au.toString() + ", ";
		}
		return String.format("Book = [name = %s, %s, price = %f, qty = %d", name, authors, price, qty);
	}
}
