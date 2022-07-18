import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };
        Scanner scanner = new Scanner(System.in);
        System.out.println("...........................................TIC-TAC-TOE GAME.........................................\n");
        System.out.print("Enter Name Of first Player  : ");
        String fname = scanner.nextLine();
        System.out.print("Enter Name Of second Player : ");
        String sname = scanner.nextLine();
        System.out.println();
        System.out.println("........................................Let's Begin the Game........................................\n");
        printBoard(board);
        while (true) {
            player1Turn(board, scanner,fname);
            if (isGameFinished(board,fname,sname)) {
                break;
            }
            printBoard(board);

            player2Turn(board, scanner,sname);
            if (isGameFinished(board,fname,sname)) {
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }

    private static boolean isGameFinished(char[][] board,String fname,String sname) {

        if (hasContestantWon(board, 'X')) {
            printBoard(board);
            System.out.println("......................................."+fname+" wins!..............................................");
            return true;
        }

        if (hasContestantWon(board, 'O')) {
            printBoard(board);
            System.out.println("......................................."+sname+" wins!..............................................");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("........................................The Game Ended In a Tie!.....................................");
        return true;
    }

    private static boolean hasContestantWon(char[][] board, char symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
                    return true;
                }
                return false;
            }
            
            private static void player2Turn(char[][] board, Scanner scanner,String sname) {
                String userInput;
                while (true) {
            System.out.println("................................................................................................");
            System.out.println(sname+" it's your Turn");
            System.out.println("Enter a slot number to place : ");
            userInput = scanner.nextLine();
            System.out.println("................................................................................................");
            if (isValidMove(board, userInput)) {
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
            }
        }
        placeMove(board, userInput, 'O');
    }

    private static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void player1Turn(char[][] board, Scanner scanner,String fname) {
        String userInput;
        while (true) {
            System.out.println(".................................................................................................");
            System.out.println(fname+" it's your turn");
            System.out.println("Enter a slot number to place : ");
            userInput = scanner.nextLine();
            System.out.println(".................................................................................................");
            if (isValidMove(board, userInput)) {
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
            }
        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}