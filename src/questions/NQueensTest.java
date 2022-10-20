package questions;

import static org.junit.Assert.*;

import java.util.stream.Stream;

//import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NQueensTest {

	 public static Stream<Arguments> testNQueens(){
	        return Stream.of(
	        		Arguments.of(new int[][] {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}, new int[][] {{0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0}}),
	                Arguments.of(new int[][] {{0}}, new int[][] {{1}}));
	 }
	    
	    @ParameterizedTest
	    @MethodSource
	    public void testNQueens(int[][] target ,int[][] excepted) {
	        int[][] result = NQueens.solveNQueens(target);
	        assertArrayEquals(excepted, result);
	    }


}
