package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		//Arrange the array in ascending order
		Arrays.sort(data);  //{2,3,4,6,7,11}
		
		//Pick the 2nd element from the last and print it
		int secondLargest = (data[data.length-2]);
			System.out.println(secondLargest);
		}
		
}
