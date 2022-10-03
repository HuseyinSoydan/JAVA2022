package calısma;

public class Functions {

	public static void main(String[] args) {
		int top1 = 7;
		int top2 = 6;
		int dönenCevap = toplama(top1, top2);
		System.out.println(dönenCevap);
		System.out.println(merhaba("Huseyin"));
		System.out.println(yılBul(26));
		
		bye();

	}
	
	public static int toplama(int sayı1, int sayı2) {
		int cevap;
		cevap = sayı1 + sayı2;
		return cevap;
	}
	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}
	public static String yılBul(int yaş) {
		int yıl = 2022 - yaş;
		return yıl + " yılında doğdunuz. ";
	}
	
	public static void bye() {
		System.out.println("Görüşürüz.");
	}
}