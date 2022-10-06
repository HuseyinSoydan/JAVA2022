package week3.homework;

public class Main {
	public static void main(String[] args) {

//		        CreditManager creditManager = new CreditManager();
//		        creditManager.calculate();
//		        creditManager.save();
//
//		        Customer customer = new Customer();
//		        customer.Id = 1;
//		        customer.city = "Mersin";
//
//		        CustomerManager customerManager = new CustomerManager(customer);
//		        customerManager.save();
//		        customerManager.delete();
//
//		        CustomerManager customerManager2 = new CustomerManager(new Person());
//
//		        Company company = new Company();
//		        company.taxNumber = "12345";
//		        company.companyName = "Kodlama.io";
//		        company.id = 100;
//
//		        Person person = new Person();
//		        person.identityNumber = "123456";
//
//		        Customer c1 = new Customer();
//		        Customer c2 = new Person();
//		        Customer c3 = new Company();

		        CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		        customerManager.giveCredit();
		    }
}