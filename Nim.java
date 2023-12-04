import java.util.Scanner;

public class Nim
{ 
	public static void main(String[] args)
	{
        Game game = new Game();
        System.out.println("Welcome to our game of Nim! How many players are there?");
        Scanner in = new Scanner(System.in);
        int numPlayers = in.nextInt();
        game.startGame(numPlayers);

        
        System.out.println("Would you like to play again with the AI? Y/N");
        Scanner in2 = new Scanner(System.in);  
        String playAgain = in2.nextLine();

        if (playAgain.equals("Y")){
            Game game2 = new Game();
            game2.startGame(1);
        }

        System.out.println("Thanks for playing!");


    }
}