package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] array1 = {3,2,11,4,6,7};	 
		int[] array2 = {1,2,8,4,9,7};
		
		
		Set<Integer> intersection = new HashSet<Integer>();
		
		 for (int i = 0; i < array1.length; i++) 
			 intersection.add(array1[i]);		    
		 
		 
		 for (int j = 0; j < array2.length; j++) {
		    	
		      // check if the element is present in the set
		      if (intersection.contains(array2[j])) {
		    	  System.out.print(array2[j]+ " ");
		       
		      }
		      
		      
	
		 }
	
	
	}
	
	
}	

