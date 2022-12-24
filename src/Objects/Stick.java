package Objects;

import util.Wather;
import util.Weather;

public class Stick extends PhisicalObject{
    public Stick(String name, Size size){
        super(name, size);
    }

    public void hideUnderWater(Wather wather){
        System.out.println("На следущее утро " + this.getName() + " скрылась под " + wather.getName());
    }
}
