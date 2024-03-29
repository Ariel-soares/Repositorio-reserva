package model.entities;

public class Product {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {
	}

	public Product(String name, Double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Double total() {
		return this.getQuantity() * this.getPrice();
	}
	
	public String toString() {
		return name + ", " + total();
	}

}
