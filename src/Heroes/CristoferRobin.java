package Heroes;

import Locations.OpenLocation;
import Objects.Stick;
import util.Ground;
import util.Road;
import util.Wather;
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


    public void morningCheck(Stick stick, Ground ground, Wather wather, Road road, int numberOfDay){
        int cntDay = 2;
        System.out.println(this.getName() + " воткнул" + stick.getName() + " в " + ground.getName());
        while (cntDay < numberOfDay){
            cntDay++;
            stick.hideUnderWater(wather);
            road.shorten();
            System.out.println(this.getName() + " воткнул" + stick.getName() + " в " + ground.getName());
        }

    }
}
