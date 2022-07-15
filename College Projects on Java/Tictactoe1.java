import java.util.Scanner;

public class Tictactoe1 {
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;
	private String regex = "\\s{3}";

	/**
	 * Tictactoe constructor
	 */
	public Tictactoe1() {
		board = new String[ROWS][COLUMNS];
		this.initializeBoard();
		// this.winXtest();
	}

	/**
	 * initializing board and fill with empty spaces
	 */
	public void initializeBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				board[i][j] = "   ";
			}
		}
	}

	/**
	 * setPlay method will set player's move
	 * 
	 * @param i
	 * @param j
	 * @param player
	 */
	public void setPlay(int i, int j, String player) {
		if (board[i][j].matches(regex))
			board[i][j] = " " + player + " ";
	}

	/**
	 * finding winners
	 */
	public boolean isGameOver() {
		// checking rows
		for (int i = 0; i < ROWS; i++) {
			if (!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
				return true;
			}
		}
		// checking columns

		for (int j = 0; j < COLUMNS; j++) {
			if (!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]))
				return true;
		}
		// checking diagonals
		if (!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
			return true;
		if (!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
			return true;
		// no body's won
		return false;

	}

	/**
	 * Print board to screen
	 * 
	 * @return strBoard
	 */
	public String printBoard() {
		String strBoard = "";
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (j == COLUMNS - 1)
					strBoard += board[i][j];
				else
					strBoard += board[i][j] + "|";
			}
			if (i != ROWS - 1)
				strBoard += "\n---+---+---\n";
		}
		return strBoard;
	}

	/**
	 * test unit 1st column X
	 */
	public void winXtest() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (j == 0)
					board[i][j] = " X ";
				else
					board[i][j] = "   ";
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tictactoe1 game = new Tictactoe1();
		String player = "X";
		
		do {
			System.out.println(game.printBoard());
			System.out.println("enter row for " + player + " or -1 to exit: ");
			int row = input.nextInt();
			if(row == -1) 
				break;
			System.out.println("enter column for " + player + ": ");
			int column = input.nextInt();
			game.setPlay(row,  column, player);
			if(game.isGameOver()) {
				System.out.println(game.printBoard() + "\n" + player +" wins!");
				break;
			}
			if(player == "X") {
				player = "O";				
			}
			else {
				player = "X";
			}
		}while(true);
		System.out.println("Goodbye!..");
	}
}