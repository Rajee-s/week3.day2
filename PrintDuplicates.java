package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
//
//		Set<Integer> duplicates = new HashSet<Integer>();
//
//		for(int num : arr) {
//			if(duplicates.add(num)==false)
//				System.out.println(num);
//		}
		
		int length  =arr.length;
		int count;
		
		for(int i = 0; i<length-1; i++) {
			
			count = 0;
			for(int j = i+1; j<length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				
				}
				if(count>0) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	

	}

}
