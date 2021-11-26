package ecomHomeWork261121;

// create a function that accepts an array of double, and also min max range as parameters
public class Main7 {

	public static void main(String[] args) {
		double[]array = { 0.5, 0.7, 5, -2, 12.5,-3 };
		double min  = -4;
		double max   = 10;

System.out.println(printInRange(array, max, min));
	}

	public static String printInRange(double[] arr,double max,double min) {
		double a=0;
		double b=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<max && arr[i]>min) {
				 a=arr[i];
				 if(a>b) {
					 b=a;
				 }
			}
			
			
		}return ("min= "+ a+" ,max=  "+b);
	}
}
