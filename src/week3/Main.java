package week3;

import week3.OopWithNLayeredApp.business.ProductManager;
import week3.OopWithNLayeredApp.core.logging.DatabaseLogger;
import week3.OopWithNLayeredApp.core.logging.FileLogger;
import week3.OopWithNLayeredApp.core.logging.Logger;
import week3.OopWithNLayeredApp.core.logging.MailLogger;
import week3.OopWithNLayeredApp.dataAccess.HibernateProductDao;
import week3.OopWithNLayeredApp.dataAccess.JdbcProductDao;
import week3.OopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone Xr", 9000);
		
		Logger [] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}
}
