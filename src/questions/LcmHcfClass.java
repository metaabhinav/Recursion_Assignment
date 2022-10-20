package questions;

/** find lcm and hcf of two integers
 * @author Abhinav
 *
 */
public class LcmHcfClass {
	/**by using recursion find lcm of 2 numbers
	 * @param input1 an integer
	 * @param input2 an integer
	 * @param lcmInt output being processed in recursion
	 * @return the lcm of 2 numbers
	 */
	static int lcm(int input1, int input2, int lcmInt) {
	    
	      if( lcmInt % input1 == 0 && lcmInt % input2 == 0 ) 
	        return lcmInt;
	      return lcm(input1,input2,lcmInt+1);
	    
	}
	
	/**by using recursion find gcd of 2 numbers
	 * @param input1 is an integer
	 * @param input2 is an integer
	 * @return the gcd of 2 number
	 */
	static int gcd(int input1, int input2)
  {
		 if (input1 == 0)
	            return input2;
	 
	        return gcd(input2 % input1, input1);
  }
	/** take gcd and lcm from methods and return as an array
	 * @param input1 as integer
	 * @param input2 as integer
	 * @return the gcd and lcm in a array
	 */
	static int[] lcmHcf(int input1, int input2) {
		if(!(input1 > 0) || !(input2 > 0)) {
			throw new AssertionError("Input should be greater than 0");
		}
		int [] output= new int[2];
		int lcmInt = (input1 > input2) ? input1 : input2;
		output[0] = lcm(input1,input2,lcmInt);
		output[1] =  gcd(input1,input2);
		return output;
	}
	public static void main(String args[]) {
		int[] out = (lcmHcf(9,6));
		for(int i=0;i<out.length;i++)
			System.out.print(out[i]);
	}
	
}
