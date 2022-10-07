package week3.homework2;

public class Interfaces {

	public static void main(String[] args) {
		CustomerManagerInterfaces customerManager = new CustomerManagerInterfaces(new MySqlCustomerDal());
		customerManager.add();
		
	}
}