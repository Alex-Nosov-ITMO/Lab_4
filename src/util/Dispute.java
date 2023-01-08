package util;
import Heroes.Hero;
import uncheckable.Undisputable;

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

    public Hero WhoWin(Hero a, Hero b) {

        final double CHANCE_TO_WIN = 0.5;
        boolean random;
        random = random() > 1 - CHANCE_TO_WIN;

        if (a.isDisputeMember() && b.isDisputeMember()){
            if (random){
                System.out.println("Победитель спора: " + a.getName());
                return a;
            }
            else {
                System.out.println("Победитель спора: " + b.getName());
                return b;
            }
        }
        else{
            throw new Undisputable("Спор не может состояться, так как один из участников не может участвовать в нем.");
        }
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
