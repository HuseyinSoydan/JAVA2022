package week3.homework2;

public class ProductValidator {
	
	static {
		System.out.println("Static yapıcı blok çalıştı.");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	public static boolean isValid(ProductStaticDemo productStaticDemo) {
		
		if (productStaticDemo.price>0 && !productStaticDemo.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bişey() {
		
	}
}