package week3.homework2;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("My sql eklendi.");
	}
}