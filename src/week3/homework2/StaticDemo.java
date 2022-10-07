package week3.homework2;

public class StaticDemo {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		ProductStaticDemo product = new ProductStaticDemo();
		product.price = 10;
		product.name = "";
		
		manager.add(product);
	}
}