package lab5;

public class InventoryCart {
	private static int numproduct = 0;
	private Product[] products;
	public InventoryCart(int num){
	products = new Product[num];
	}
	public void add(Product p){
	
	products[numproduct++]= p;
	}
	public Product getProductAt(int index){
		return products[index];
	}
	public Product[] getAllProduct(){
	
	Product[] pd = new Product[numproduct];
	
	for(int i =0;i<numproduct;i++)
		pd[i]=products[i];
		return pd;
	}
}