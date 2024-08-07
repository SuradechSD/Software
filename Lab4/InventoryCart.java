/*package Lab4;
public class InventoryCart {
	private Product[] products;
	private int index = 0;

	public InventoryCart(int product) {
		products = new Product[product];
	}
	public void addProduct(Product p) {
		products[index++] = p;
	}
	public Product getProductAt(int num) {
        if (num >= 0 && num < products.length) {
            return products[num];
        } else {
            return null; 
        }
    }
	public Product[] getAllProduct() {
		return products;
	}
    public void add(Product p2) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}*/