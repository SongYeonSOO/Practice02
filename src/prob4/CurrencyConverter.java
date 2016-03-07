package prob4;

public class CurrencyConverter {

	private static double RATE = 1121.0;

	public static double toDollar(double won) {
		/* 구현합니다. */
		
		return won/RATE;
	}

	public static double toKWR(double dollar) {
		/* 구현합니다. */
		return dollar*RATE;
	}

	public static void setRate(double r) {
		/* 구현합니다. */
		RATE = r;
	}

	public static void main(String[] args) {
		/* 구현합니다. */
		
		System.out.println("백 만원은 "+toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는 "+toKWR(100)+"원입니다.");
	}
}
