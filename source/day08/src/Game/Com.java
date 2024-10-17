package Game;

import java.util.ArrayList;
import java.util.List;

public class Com implements ComF {
    @Override
    public List<Integer> ComRandom(int PlayBallCount) {
        List<Integer> Goal = new ArrayList<>();
        int NumComGoal = 0;
        do {
            Goal.add((int)(Math.random() * 9 + 1));
            if (NumComGoal - 1 >= 0 && Goal.get(NumComGoal).equals(Goal.get(NumComGoal -1)) ||
                    NumComGoal - 2 >= 0 && Goal.get(NumComGoal).equals(Goal.get(NumComGoal -2))){
                Goal.remove(NumComGoal);
                continue;
            }else if (Goal.get(0).equals(0)){
                Goal.remove(NumComGoal);
                continue;
            }else if(Goal.get(NumComGoal) >= 10){
                Goal.remove(NumComGoal);
                continue;
            }
            NumComGoal++;
        }while (NumComGoal < PlayBallCount);

        return Goal;
    }
}
