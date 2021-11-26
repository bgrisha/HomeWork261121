package ecomHomeWork261121;

import java.util.Random;

//create a function that accepts Random as an argument and prints a random number and also gets
// the min max range as parameters

//lowest possible output:->0.0 * (max - min) + min => min

//Since 1.0 is the exclusive upper bound of Math.random, this is what we get:
//1.0 * (max - min) + min => max - min + min => max


public class Main6 {

	private static final Random r = new Random();
	
	
	public static void main(String[] args) {
		
		System.out.println(createRandom(r, 2, 20));

	}

	public static int createRandom(Random r,  int min,int max) {
		
		
//	    return r.ints(min, max) .findFirst() .getAsInt();
		 return r.nextInt(max - min) + min;
	     
	     
	}
}
