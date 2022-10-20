package questions;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LinearBinaryTest {

	 public static Stream<Arguments> linearBinaryTesting(){
	        return Stream.of(
	                Arguments.of(new int[] {1, 2, 3, 4, 5}, 4, new int[] {4,4}),
	                Arguments.of(new int[] {}, 4,new int[] {0}),
	                Arguments.of(new int[] {3,4,5},5, new int[] {3,3}),
	                Arguments.of(new int[] {1,2,2,2,5},2, new int[] {2,2}),
	                Arguments.of(new int[] {2, 3, 4, 6, 8}, 2, new int[] {1,1}));
	    }
	 @ParameterizedTest
	    @MethodSource
	    public void linearBinaryTesting(int[] testArr, int find, int[] expected) {
	        int[] check = LinearBinary.linearBinary(testArr, find);
	        assertArrayEquals(expected, check);
	        
	    }

}
