//Code an interactive,Two Player game of Tic-Tac-Toe .You will use a two dimensional array of chars.

import java.io.*;
import java.util.*;

class Board
{
    private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;

    public Board() 
    {
		board = new String[ROWS][COLUMNS];
		this.initializeBoard();
		// this.winXtest();
	}

    public void initializeBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				board[i][j] = "   ";
			}
		}
	}

    public String printBoard() 
    {
		String strBoard = "";
		for (int i = 0; i < ROWS; i++) 
        {
			for (int j = 0; j < COLUMNS; j++) 
            {
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
}

public class TicTacToe
{
    public static void main(String[] args) 
    {
        Board player=new Board();
        int TwoDBoard[][]=new int[3][];
        Scanner sc=new Scanner(System.in);
        System.out.println(".......................TIC-TAC-TOE GAME........................");
        System.out.print("Enter Name Of first Player  : ");
        String fname=sc.nextLine();
        System.out.print("Enter Name Of second Player : ");
        String sname=sc.nextLine();
        System.out.println();
        System.out.println("Let's Decide Who wants to play first by tossing a coin");
        System.out.println("First Player Enter Your choice\n1.Head then input as 'Head'\n2.Tail then input as 'Tail'\n");
        String op=sc.next();
        double rand =Math.random();      //Generate random number between 0 and 1.
        String coin="";
        if(rand<0.5)
            coin="Head";
        else
            coin="Tail";
        System.out.println("It's "+coin);
        if(op.equals(coin))
        {
            // First player kaa turn
            // Board player1=new Board();
            do
            {
                System.out.println(player.printBoard());
                System.out.println("woww.......Won the toss\nFirst Player's Turn ");
                System.out.print("Do You Want Choose X's (Or) O's : ");
                char ch1 = sc.next().charAt(0);
                switch(ch1)
                {
                    case 'X' : System.out.println("Player1 have Chosen : "+ch1);
                               System.out.println("enter row for " + ch1 + " or -1 to exit: ");
                               int row = sc.nextInt();
                               if(row == -1) 
                                   break;
                               System.out.println("enter column for " + ch1 + ": ");
                               int column = sc.nextInt();
                               //display(ch1,TwoDBoard);
                               
                            }
                        }while(true);
                    }
                    else
                    {
                        // Second player kaa turn
                        // Board player2=new Board();
                        do
                        {
                            System.out.println(player.printBoard());
                            System.out.println("woww.......Won the toss\nSecond Player's Turn ");
                            System.out.print("Do You Want Choose X's (Or) O's : ");
                            char ch2 = sc.next().charAt(0);
                            switch(ch2)
                            {
                                case 'X' : System.out.println("Player2 have Chosen : "+ch2);
                                System.out.println("enter row for " + ch2 + " or -1 to exit: ");
                                int row = sc.nextInt();
                                if(row == -1) 
                                    break;
                                System.out.println("enter column for " + ch2 + ": ");
                                int column = sc.nextInt();
                            }
            }while(true);
        }
    }
}