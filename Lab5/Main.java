package Lab5;

public class Main {
	public static void main(String[] args) {

		Product p1 = new Product("XA1101","Haru",30);
		Product p2 = new Product("XA1102","Oichi",30);
		Product p3 = new Product("XA1103","Vfoodmix",39);

		InventoryCart ic = new InventoryCart (10);

		ic.addProduct(p1);
		ic.addProduct(p2);
		ic.addProduct(p3);
		
		Cashier c = new Cashier("bella");

		c.printReceipt(ic);
		
	}
}