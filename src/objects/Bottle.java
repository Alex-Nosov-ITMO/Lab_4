package objects;

import Heroes.Hero;
import Locations.OpenLocation;
import interfaces.ICanSwim;
import util.Water;

import java.util.Objects;

public class Bottle extends PhisicalObject implements ICanSwim {
    private int speed;
    public Bottle(String name, Size size){
        super(name, size);
    }

    @Override
    public void swim(Water water, Hero hero, int speed) {
        class SpeedChanger{
            int toKMH(int speed){
                return (int) Math.round(speed * 3.6);
            }
        }
        SpeedChanger changer = new SpeedChanger();
        this.speed = changer.toKMH(speed);

        System.out.println(this.getName() + " плывет по " + water.getName() + " мимо " + hero.getName()
                + " со скоростью " + speed + " м/с(" + this.speed + " км/ч)"  );
    }

}
