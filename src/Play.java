import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        TicTacToe game = new TicTacToe();
        int player = 1;
        int row = 0;
        int colum = 0;
        boolean played;

        while(!game.isGameOver()) {

            System.out.println("Player " + player + " enter your row");
            row = input.nextInt() - 1;
            System.out.println("Player " + player + " enter your colum");
            colum = input.nextInt() - 1;

            played = game.play(row, colum);

            // your code here

            if (player == 1 && played)
            {
                player = 2;
            }
            else if (played) {
                player = 1;
            }
            
            game.printBoard();
        }
        System.out.println("Player " + game.getWinner() + " won.");
        input.close();

    }
}
