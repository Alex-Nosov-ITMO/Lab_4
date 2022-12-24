package util;

import Heroes.Hero;
import Heroes.Puh;

import java.util.Objects;

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

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name==" + this.name + ", numberOfPots==" + this.numberOfPots;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfPots);
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;
        RescueOperation other = (RescueOperation) oth;
        return name.equals(other.name) && numberOfPots == other.numberOfPots;
    }
}
