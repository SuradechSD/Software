package Lab5;

public class Cashier {
	public String nameCahier;
	
	public Cashier(String nameCart) {       //
		this.nameCahier = nameCart;         //Constructor cashier
	}                                       //
	public void printReceipt(InventoryCart cart) {  //ตะกร้าสินค้า

        double total = 0;     //ราคาเริ่มต้นก่อนสแกนสินค้า                                                  
        System.out.println("\tPumkin Shop ( " + nameCahier + " )");//ชื่อคน

        for (int i = 0; i < cart.getAllProduct().length; i++) {      //ตรวจสอบว่าสินค้ามีทั้งหมดกี่ชิ้น
            Product eachProduct = cart.getProductAt(i);              //เอาออกมาตามจำนวนชิ้นในตะกร้า
            if (eachProduct != null) {                     //ถ้าของยังไม่หมดตะกร้าก็เอาออกมาต่อไป ถ้าหมดแล้วให้ทำโค้ดข้างล่างนี้
                System.out.println("1 x " + eachProduct.getName()+ "\t(" + eachProduct.getCode() + ")\t" + eachProduct.getPrice());  //ส่วนของการทำใบเสร็จ เอาชื่อ โค้ด ราคา มาทำใบเสร็จ
                total = total + eachProduct.getPrice();    //เอาสินค้าแต่ละชิ้นมาคิดเงินโดยราคาสินค้ามาจากข้อมูลใน main
            }              
        }
		System.out.println("\t\t\s--------------------");
        System.out.println("\t\tTotal "+total+" ");            //เสียตังเท่าไหร่เตรียมเงินไว้เลย
        
	}
}
