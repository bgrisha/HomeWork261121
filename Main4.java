package ecomHomeWork261121;

public class Main4 {

	public static void main(String[] args) {

		int number1 = 5;
		int number2 = 8;
		int number3 = 10;

		System.out.println(printBiggest());
		System.out.println(printBiggest(number1));
		System.out.println(printBiggest(number1, number2));
		System.out.println(printBiggest(number1, number2, number3));

	}

	public static String printBiggest() {
		return "I am the biggest of them all!";
	}

	public static String printBiggest(int a) {
		return a + " is biggest";
	}

	public static String printBiggest(int a, int b) {
		return Math.max(a, b) + " is biggest";
	}

	public static String printBiggest(int a, int b, int c) {
		return Math.max(Math.max(a, b), c) + " is biggest";
	}

}
