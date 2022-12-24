package Heroes;

import Locations.OpenLocation;
import objects.Stick;
import util.Ground;
import util.Road;
import util.Water;
import util.Weather;

public class CristoferRobin extends Hero{
    public CristoferRobin(String name, boolean disputemember){
        super(name, disputemember);
    }
    public void live(OpenLocation openLocation){
        System.out.println(this.getName() + " живет в " + this.locate() + ", который находится в " + openLocation.getName());
    }

    public String lookDawn(){
        return " смотреть вниз";
    }

    public String admireTheWater(){
        return " любоваться водой";
    }

    public String stayHome(){
        return " решил остаться дома ";
    }

    public String thingOfDifferentThings(){
        return " думать о разных вещах";
    }


    public void sitHomeDuringTheRains(){
        System.out.println(this.getName() + this.lookDawn() +" и" + this.admireTheWater() + ", однако "
                + Weather.RAINY.getWeatherDescription()+ ", поэтому " + this.getName() + this.stayHome() + "и" + this.thingOfDifferentThings());
    }


    public void morningCheck(Stick stick, Ground ground, Water water, Road road, int numberOfDay){
        int cntDay = 1;

        if (numberOfDay < 1){
            numberOfDay = 1;
        }
        else if (numberOfDay > 5){
            numberOfDay = 5;
        }
        while (cntDay <= numberOfDay){
            cntDay++;
            System.out.println(this.getName() + " воткнул" + stick.getName() + " в " + ground.getName());
            stick.hideUnderWater(water);
            road.shorten();
        }

    }
}
