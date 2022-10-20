package questions;

import java.security.InvalidParameterException;

/**The N Queen is the problem of placing N chess queens 
 * on an N×N chessboard so that no two queens attack each other.
 * @author Abhinav
 *
 */
public class NQueens {
	
	
	/**isSafe method returns true or false that whether you can place the queen and 
	 * it will be safe at that position or not
	 * @param chessBoard it is a matrix that contains of the queen on the board
	 * @param row position of the matrix where you want to check
	 * @param column position of matrix where you want to check
	 * @return true or false that you can place the queen or not
	 */
	static boolean isSafe(int [][] chessBoard, int row, int column){
		 int iterator1, iterator2;
		 
	        for (iterator1 = 0; iterator1 < column; iterator1++) {
	            if (chessBoard[row][iterator1] == 1)
	                return false;
	        }
	        for (iterator1 = row, iterator2 = column; iterator1 >= 0 && iterator2 >= 0; iterator1--, iterator2--) {
	            if (chessBoard[iterator1][iterator2] == 1)
	                return false;
	        }
	     
	        for (iterator1 = row, iterator2 = column; iterator2 >= 0 && iterator1 < chessBoard.length-1; iterator1++, iterator2--) {
	            if (chessBoard[iterator1][iterator2] == 1)
	                return false;
	        }
	        return true;
	}
	/**The N Queen is the problem of placing N chess
	 *  queens on an N×N chessboard so that no two queens attack each other.
	 * @param chessBoard it is a matrix that contains of the queen on the board
	 * @param startColumn column number where you want to do the operation 
	 * @param dimensionOfMatrix size of the matrix
	 * @return
	 */
	static boolean nQueen(int[][] chessBoard, int startColumn, int dimensionOfMatrix) {
		if(startColumn >= dimensionOfMatrix)
			return true;
		for(int row = 0; row<chessBoard.length; row++) {
			if(isSafe(chessBoard, row, startColumn)) {
				chessBoard[row][startColumn] = 1;
				if(nQueen(chessBoard, startColumn+1,dimensionOfMatrix) == true)
					return true;
				chessBoard[row][startColumn] = 0;
			}		
		}
		return false;
	}
	/**
	 * @param board it is a matrix that contains of the queen on the board
	 * @return the chessboard where all queens are set
	 * @throws InvalidParameterException where queen can not be set
	 */
	public static int[][] solveNQueens(int[][] board) throws InvalidParameterException {
        int[][] chessBoard = board;
        if (nQueen(chessBoard, 0, board.length)==false)
            throw new InvalidParameterException("Board cannot be solved");
        return chessBoard;
    }
	

}
