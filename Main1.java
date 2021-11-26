package ecomHomeWork261121;

import java.util.Arrays;

//2.	Create in Main Array of Grades: 
// {62.5, 30, 98, 100, 55.5, 80, 75, 40 , 56, 99, 86, 85.5, 55, 90}
//greatestGrade – that get the Array as parameter and return the higher grade.
//another Function - that get the Array as parameter and return the average grade of array.
public class Main1 {

	public static void main(String[] args) {
		double[] array = { 62.5, 30, 98, 1, 55.5, 80, 75, 40, 56, 99, 86, 85.5, 55, 90 };
		
//		System.out.println(Arrays.toString(array));

		System.out.println(greatestGrade(array));
// return avg
		System.out.println(avg(array));
		

	}

	public static double greatestGrade(double[] arr) {
		
			double max = -1;

			for (int i = 0; i < arr.length; i++)

				if (max < arr[i])

					max = arr[i];

			return max;

		
	}
	public static double avg(double[]array){
        double sum=0;
        
        for (int i = 0; i <array.length ; i++) {
             sum+=array[i];
        }
        return sum/array.length;
    }
	
}