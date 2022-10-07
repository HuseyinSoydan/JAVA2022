package week3.homework2;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}