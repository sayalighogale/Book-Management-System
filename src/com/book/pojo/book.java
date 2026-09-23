package com.book.pojo;

public class book {

	private int bookId;
	private String bName;
	private String author;
	private double price;
	private int quantity;
	private String category;


	public book() {
		super();
	}


	public book(int bookId, String bName, String author, double price, int quantity, String category) {
		super();
		this.bookId = bookId;
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}


	public book(String bName, String author, double price, int quantity, String category) {
		super();
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", bName=" + bName + ", author=" + author + ", price=" + price
				+ ", quantity=" + quantity + ", category=" + category + "]";
	}

}
