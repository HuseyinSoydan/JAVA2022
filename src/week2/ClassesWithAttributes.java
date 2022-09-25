package week2;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		ProductAttributes product = new ProductAttributes(1,"Laptop","Asus Laptop", 3000, 3, "Siyah");
//		product.setName ("Laptop");
//		product.setId(1); 
//		product.setDescription ("Asus Laptop");
//		product.setPrice (5000);
//		product.setStockAmount (3);
		
		
		ProductManager productManager = new ProductManager ();
		productManager.Add(product);
		System.out.println(product.getKod());
		
	}
}