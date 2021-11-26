package ecomHomeWork261121;

import java.util.Scanner;

//1.	Write a method named isEven that accepts an int argument.
//The method should return true if the argument is even, or false otherwise.
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		System.out.println(isEven(num));
		
		
	}

	public static boolean isEven(int number) {
		if(number %2==0) {
			return true;
		}return false;
	}
}
