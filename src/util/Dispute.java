package util;
import Heroes.Hero;

import java.util.Objects;

import static java.lang.Math.*;
public class Dispute {
    private String name;


    public Dispute(String name){
        System.out.println(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Hero WhoWin(Hero a, Hero b){

        final double CHANCE_TO_WIN = 0.5;
        boolean random;
        if(random() > 1 - CHANCE_TO_WIN) {
            random = true;
        }
        else random = false;

        if (!a.isDisputeMember() && !b.isDisputeMember()){
            System.out.println("Спор не может состояться, так как ни один из участников не может участвовать в нем.");
            return null;
        }
        else if (!a.isDisputeMember()){
            System.out.println(a.getName() + " не может участвовать в споре");
            return null;
        }
        else if (!b.isDisputeMember()){
            System.out.println(b.getName() + " не может участвовать в споре");
            return null;
        }
        else if (random){
            System.out.println("Победитель спора: " + a.getName());
            return a;
        }
        System.out.println("Победитель спора: " + b.getName());
        return b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name=" + this.name + "]";
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;

        Dispute other = (Dispute) oth;
        return name.equals(other.name);
    }
}
