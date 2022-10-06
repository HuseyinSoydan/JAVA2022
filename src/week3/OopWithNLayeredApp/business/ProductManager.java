package week3.OopWithNLayeredApp.business;

import java.util.List;

import week3.OopWithNLayeredApp.core.logging.Logger;
import week3.OopWithNLayeredApp.dataAccess.HibernateProductDao;
import week3.OopWithNLayeredApp.dataAccess.JdbcProductDao;
import week3.OopWithNLayeredApp.dataAccess.ProductDao;
import week3.OopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers2) {
		this.productDao = productDao;
		this.loggers = loggers2;
	}


	public void add(Product product) throws Exception {
		
		if (product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}
}
