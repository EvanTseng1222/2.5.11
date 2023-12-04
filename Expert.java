import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Expert extends Player{
    Random rand = new Random();
    private int score = 0;

    public Expert(){

    }

    public int returnScore(){
        return score;
    }

    public int takeSticks(int totalSticks){
        List<Integer> magicNums = Arrays.asList(1, 3, 7, 15);
        int sticksLeft = 0;
        
        for (int loseSticks : magicNums){
            if (totalSticks == loseSticks){
                sticksLeft = rand.nextInt(totalSticks/2) + 1;
                if (sticksLeft == 0){
                    sticksLeft++;
                }
            }
        }

        if (totalSticks > 15){
            totalSticks = 15;
        } else if (totalSticks > 7){
            totalSticks = 7;
        } else if (totalSticks > 3){
            totalSticks = 3;
        } else if (totalSticks > 1){
            totalSticks = 1;
        }

        return totalSticks;

    }


}
