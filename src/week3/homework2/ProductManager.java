package week3.homework2;

public class ProductManager {
	public void add(ProductStaticDemo productStaticDemo) {
		
		if (ProductValidator.isValid(productStaticDemo)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
 }