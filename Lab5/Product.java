package Lab5;

public class Product {

	private String code;
	private String name;
	private double price;
    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String code,String name,double price) {	//
		this.code = code;									// Constructor
		this.name = name;									//
		this.price = price;									//
	}
}