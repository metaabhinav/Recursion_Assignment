package questions;

import static org.junit.Assert.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LcmHcfClassTest {

	public static Stream<Arguments> lcmHcfTesting(){
        return Stream.of(
                Arguments.of(9, 6, new int[] {18,3}),
                Arguments.of(3, 3, new int[] {3,3}),
                Arguments.of(3, 5, new int[] {15,1}));
        		
//                Arguments.of(new int[] {}, 4,new int[] {0}),
//                Arguments.of(new int[] {3,4,5},5, new int[] {3,3}),
//                Arguments.of(new int[] {2, 3, 4, 6, 8}, 2, new int[] {1,1}));
    }
 @ParameterizedTest
    @MethodSource
    public void lcmHcfTesting(int input1, int input2, int[] expected) {
        int[] check = LcmHcfClass.lcmHcf(input1, input2);
        assertArrayEquals(expected, check);
        
    }
}
