package prob03;

public class CurrencyConverter {
	private static double rate;

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		double a = won / rate;

		return a;
	}

	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		double b = dollar * rate;

		return b;
	}

	public static void setRate(double r) {
		// 환율 설정(KRW/$1)\
		rate = r;
	}
}
