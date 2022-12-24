package objects;

import util.Water;

public class Stick extends PhisicalObject{
    public Stick(String name, Size size){
        super(name, size);
    }

    public void hideUnderWater(Water water){
        System.out.println("На следущее утро " + this.getName() + " скрылась под " + water.getName());
    }
}
