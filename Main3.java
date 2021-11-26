package ecomHomeWork261121;
//Create function A() and call it from main, inside function A() call function B(),
// inside function B() call function A().

//StackOverflowError - רקורסיה אינסופית
//כאשר קוראים לפונקציה  א ממשיכה לקרוא לעצמה תוך ניצול מקום על מחסנית הקריאות עם כל קריאה, עד שהמחסנית "גולשת", מה שמביא לשגיאת segmentation fault.
// לולאה אין סופית , A קוראת ל-B ואז B קוראת ל-A
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A();
	}

	public static void A() {
		System.out.println("1");
		B();
		System.out.println("3");
	}
	public static void B() {
		System.out.println("2");
		A();
		System.out.println("4");
	}
}
