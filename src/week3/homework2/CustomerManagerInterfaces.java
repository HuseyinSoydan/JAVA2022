package week3.homework2;

public class CustomerManagerInterfaces {
	private ICustomerDal customerDal;
	
	public CustomerManagerInterfaces(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		customerDal.add();
		
	}
}