import java.util.Random;

public class Game {
    Random rand = new Random();
    int totalSticks = rand.nextInt(30) + 1;
    boolean gameOver = false;
    int turn = rand.nextInt(2) + 1;

    public Game(){

    }

    public void startGame(int numPlayers){
        if (numPlayers == 1){
            Player player1 = new Player();
            Expert expert = new Expert();
            runGameExpert(player1, expert);

        } else if (numPlayers == 2){
            System.out.println("Player 1:");
            Player player1 = new Player();
            System.out.println("Player 2:");
            Player player2 = new Player();
            runGamePlayers(player1, player2);
        } else {
            System.out.println("Please enter a valid player count.");
        }
    }

    public void runGamePlayers(Player player1, Player player2){
        while (totalSticks > 1){
            System.out.println("The total number of sticks are " + totalSticks);
            if (turn == 1){
                System.out.println("It is " + player1.returnName() + "'s turn.");
                int sticksGone = player1.takeSticks();
                    while (sticksGone > totalSticks/2){
                        System.out.println("Illegal number of sticks");
                        sticksGone = player1.takeSticks();
                    }
                totalSticks -= sticksGone;
                turn = 2;
                
            } else if (turn == 2){
                System.out.println("It is " + player2.returnName() + "'s turn.");
                int sticksGone = player2.takeSticks();
                    while (sticksGone > totalSticks/2){
                        System.out.println("Illegal number of sticks");
                        sticksGone = player2.takeSticks();
                    }
                totalSticks -= sticksGone;
                turn = 1;

            }

        }

        System.out.println("Only the last stick is left.");
        if (turn == 1){
            System.out.println("The winner is " + player2.returnName());
        } else {
            System.out.println("The winner is " + player1.returnName());
        }
        
    }

    public void runGameExpert(Player player1, Expert expert){
        while (totalSticks > 1){
            System.out.println("The total number of sticks are " + totalSticks);
            if (turn == 1){
                System.out.println("It is " + player1.returnName() + "'s turn.");
                int sticksGone = player1.takeSticks();
                    while (sticksGone > totalSticks/2){
                        System.out.println("Illegal number of sticks");
                        sticksGone = player1.takeSticks();
                    }
                totalSticks -= sticksGone;
                turn = 2;

            } else if (turn == 2){
                System.out.println("It is the expert Ai's turn.");
                System.out.println("Expert AI has taken " + (totalSticks-expert.takeSticks(totalSticks)) + " sticks.");
                totalSticks = expert.takeSticks(totalSticks);

                turn = 1;
            }
        }

        System.out.println("Only the last stick is left.");
        if (turn == 1){
            System.out.println("The winner is the expert AI!");
        } else {
            System.out.println("The winner is " + player1.returnName());
        }

    }
}


