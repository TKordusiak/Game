package game;

public class TicTacToe {

	public static void main(String[] args) {
		
		char [][] board = {{'.','.','.'},
							{'.','.','.'},
							{'.','.','.'}};
		TicTacToe.printBoard(board);
		
		
	}
	
	private static void printBoard(char[][] board) {
		
		
		//indeksy kolumn
				System.out.println("\tA\tB\tC");
				
				//wyświetlanie planszy do giry
				for(int line=0; line<board.length; line++) {
					System.out.print(line +"\t");
					for(int column=0; column<board[line].length; column++) {
						System.out.print(board[line][column]+"\t");
					}
					System.out.println();
				}
	}

}
