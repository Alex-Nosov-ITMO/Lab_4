package Objects;

import Heroes.Hero;
import util.Wather;

public class Bottle extends PhisicalObject implements ICanSwim{
    public Bottle(String name, Size size){
        super(name, size);
    }

    @Override
    public void swim(Wather wather, Hero hero) {
        System.out.println(this.getName() + " плывет по " + wather.getName() + " мимо " + hero.getName());
    }
}
