package week2;

public class MethodOverloading {

	public static void main(String[] args) {
		DortIslemMethod dortIslem = new DortIslemMethod();
		System.out.println(dortIslem.topla(2, 3));
		dortIslem.topla2(2, 3, 5);
		System.out.println(dortIslem.topla2(2, 3, 5));
	}
}