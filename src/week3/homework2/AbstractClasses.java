package week3.homework2;

public class AbstractClasses {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		
		GameCalculator gameCalculator = new OlderGameCalculator();
		gameCalculator.hesapla();
		
	}

}