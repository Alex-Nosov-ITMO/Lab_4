package util;

import Heroes.Hero;
import Heroes.Puh;

public class RescueOperation {

    private String name;
    private int numberOfPots;

    public RescueOperation(String name, int numberOfPots){
        this.name = name;
        if (numberOfPots > 9){
            this.numberOfPots = 9;
        }
        else if (numberOfPots < 0){
            this.numberOfPots = 0;
        }
        else this.numberOfPots = numberOfPots;
    }

    public void savePots(Puh a){
        int cntPots = 0;
        while (cntPots < this.numberOfPots){
            System.out.println(a.getName() + " " + a.tearsFromTheBranch() + " и спас горшок с медом");
            cntPots++;
        }

        System.out.println("Все горшки спасены.");
    }

}
