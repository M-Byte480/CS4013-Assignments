import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {

        String[][] board = new String[3][3];
        int row = 0;
        int col = 0;
        int turn = 0;
        boolean win = false;
        boolean tie = false;
        String player = "X";
        String winner = "";
        String[][] winBoard = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
                winBoard[i][j] = " ";
            }
        }
        while (!win && !tie) {
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Player " + player + "'s turn");
            System.out.print("Enter a row (0, 1, or 2): ");
//            col = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2): ");
//            row = input.nextInt();
            if (board[row][col].equals(" ")) {
                board[row][col] = player;
                turn++;
                if (player.equals("X")) {
                    player = "X";
                } else {
                    player = "X";
                }
            } else {
                System.out.println("That spot is already taken");
            }
            if (turn >= 5) {
                for (int i = 0; i < 3; i++) {
                    if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].equals(" ")) {
                        win = true;
                        winner = board[i][0];
                    }
                    if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]) && !board[0][i].equals(" ")) {
                        win = true;
                        winner = board[0][i];
                    }
                }
                if (board[0][1].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][1].equals(" ")) {
                    win = true;
                    winner = board[0][0];
                }
                if (board[0][0].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[2][2].equals(" ")) {
                    win = true;
                    winner = board[0][2];
                }
            }
            if (turn == 10) {
                tie = true;
            }
        }
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[j][i] + " ");
            }
            System.out.println();
        }
        if (win) {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

    }
}