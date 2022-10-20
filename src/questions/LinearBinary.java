package questions;

public class LinearBinary {

	/** Linear search or sequential search is a method for finding a target 
	 * value within an array. It sequentially checks each element of the array 
	 * for the target value until a match is found or until all the elements 
	 * have been searched.

	 * @param inputArray1 contains the array you want to find the element
	 * @param find the element you want to get checked
	 * @param iterator element is the position where we are checking
	 * @return the position of the element
	 */
	static int linearSearch(int[] inputArray1, int find, int iterator) {
			if(inputArray1[iterator] == find)
				return iterator+1;
			else if(iterator>inputArray1.length)
				return -1;
			else
				return linearSearch(inputArray1, find, iterator+1);
		
	}
	
	/** Binary search is a search algorithm that finds the position of 
	 * a target value within a sorted array. Binary search compares the
	 *  target value to the middle element of the array. If they are 
	 *  not equal, the half in which the target cannot lie is eliminated 
	 *  and the search continues on the remaining half, again taking 
	 *  the middle element to compare to the target value, and repeating 
	 *  this until the target value is found.
	 * @param inputArray1 contains the array you want to find the element
	 * @param find the element you want to get checked
	 * @param first staring element of the array
	 * @param last end element of array
	 * @return position of the element of the array 
	 */
	static int binarySearch(int[] inputArray1, int find, int first, int last) {
		 int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( inputArray1[mid] < find ){  
		        return binarySearch(inputArray1,find,mid+1,last);     
		      }
		      else if ( inputArray1[mid] == find ){  
		    	if(inputArray1[mid] == inputArray1[mid-1])
		    		return binarySearch(inputArray1,find,first,mid-1);
		    	else
		    		return mid+1;    
		      }
		      else{  
		    	  return binarySearch(inputArray1,find,first,mid-1); 
		      }  
		   }    
		   return -1;
	}
	/** taking position from linear and binary search from methods and returning them
	 * @param inputArray1 contains the array you want to find the element
	 * @param find the element 
	 * @return array containing position of element in array using linear and binary search
	 */
	static int[] linearBinary(int[] inputArray1, int find) {
		int[] output = new int[2];
		int temp = inputArray1[0];
		for(int iterator = 1; iterator < inputArray1.length; iterator++) {
			if(inputArray1[iterator]<temp) 
				throw new AssertionError("Array is not sorted");
			temp = inputArray1[iterator];
		}
		output[0] = linearSearch(inputArray1, find, 0);
		output[1] = binarySearch(inputArray1, find, 0, inputArray1.length-1);
		return output;
	}
}
