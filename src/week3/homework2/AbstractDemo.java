package week3.homework2;

public class AbstractDemo {

	public static void main(String[] args) {
		CustomerManagerAbstractDemo customerManager = new CustomerManagerAbstractDemo();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();

	}
}