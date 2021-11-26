package ecomHomeWork261121;

import java.util.Calendar;
import java.util.Scanner;

//3.	Create function name- printGeneralMsg()

public class Main2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("enter you name");
		String name=sc.next();
		
		System.out.println("enter you Lastname");
		String lastName=sc.next();
		
		System.out.println("enter you year of Birth");
		int yearOfBirth=sc.nextInt();
		
		System.out.println(printGeneralMsg(name, lastName, yearOfBirth));

	}

	public static String printGeneralMsg(String name,String LastName,int yearOfBirth	) {
		int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
		int age=CurrentYear-yearOfBirth;
		return "hello " + name +" " +LastName +" yoy are "+age+" years old.";
	}
}
