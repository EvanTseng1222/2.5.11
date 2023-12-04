import java.util.Scanner;

public class Player {
    private String name;
    private int score = 0;

    public Player(){
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        this.name = in.nextLine();
        System.out.println("Welcome " + this.name);
    }

    public String returnName(){
        return name;
    }

    public int returnScore(){
        return score;
    }

    // public boolean forfeit(){
    //     return true;
    // }

    public int takeSticks(){
        System.out.println("How many sticks would you like to take from the pile?");
        Scanner in = new Scanner(System.in);
        int sticks = in.nextInt();
        System.out.println(String.format("You have taken %d sticks.", sticks));
        return sticks;
        
    }


}
