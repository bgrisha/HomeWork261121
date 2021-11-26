package ecomHomeWork261121;

import java.util.Scanner;

//create a function that accepts Scanner as an argument and inputs a float from the user

public class Main5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(inputFromUser(sc));
		

	}
public static float inputFromUser(Scanner s) {
	System.out.println("enter age");
	float a=s.nextFloat();
	
	return a;
}
}
