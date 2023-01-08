import Heroes.CristoferRobin;
import Heroes.FloatingBear;
import Heroes.Hero;
import Heroes.Puh;
import Locations.CloseLocationInForest;
import Locations.OpenLocationInForest;
import checkable.EmptyStringException;
import objects.*;
import util.*;

public class Main {
    public static void main(String[] agrs) {

        OpenLocationInForest.LowlandForest lowlandForest = new OpenLocationInForest.LowlandForest("Низина леса", Weather.RAINY);
        Puh puh = new Puh("Пух", true);
        puh.setLocation(lowlandForest);
        Door door = new Door("Дверь", Size.MIDDLE);
        Pot theBiggestPot = new Pot("Горшок с мёдом", Size.THEBIGEST);
        Wood wood = new Wood("Дерево", Size.MIDDLE);
        Wood.Branch branch = wood.new Branch("Самая высокая ветка", Size.THEFATTEST);
        Water water = new Water("Вода");
        RescueOperation rescueOperation = new RescueOperation("Спасение горшков с мёдом", 5);
        Bottle bottle = new Bottle("Бутылка пяточка", Size.LITTLE);
        Paper paper = new Paper("Бумажка", Size.VERYSMALL);
        FloatingBear bear = new FloatingBear("Плавающий медведь", true);
        bear.setLocation(lowlandForest);
        CristoferRobin cristoferRobin = new CristoferRobin("Кристофер Робин", false);
        CloseLocationInForest.HouseCristofers house = new CloseLocationInForest.HouseCristofers("Дом Кристофера");
        cristoferRobin.setLocation(house);
        OpenLocationInForest.TheHighestLocationInForest theHighestLocationInForest = new OpenLocationInForest.TheHighestLocationInForest("Самое высокое место в лесу");
        Stick stick = new Stick("Палка", Size.LITTLE);
        Ground ground = new Ground("Земля");
        Road road = new Road("Дорога к дому Кристофера");





        puh.cameUp(door);
        puh.lookOut();
        branch.stickOut(water);
        puh.capture(theBiggestPot);
        puh.climbUp(branch, theBiggestPot);
        rescueOperation.savePots(puh);
        puh.sitOnBranch(branch);
        bottle.swim(water, puh, 10);
        puh.say("Мед, мед!");
        puh.jumpedOff();
        puh.capture(bottle);
        puh.climbUp(branch, bottle);
        puh.pullOut(paper, bottle);
        puh.lookAtSomething(paper);
        try {
            puh.think("Раз бутылка может плыть, то и горшок сможет.");
        }catch (EmptyStringException e){
            System.out.println(e.getMessage());
        }

        puh.throwSomething(theBiggestPot);
        puh.say("Я хочу плыть сверху");
        bear.say("Нет, я буду сверху");


        Dispute dispute = new Dispute("Спор за место под солнцем");

        Hero windispute = dispute.WhoWin(bear, puh);
        if (windispute.equals(puh)) puh.ride(bear);
        else if (windispute.equals(bear)) bear.ride(puh);


        theHighestLocationInForest.setWeather(Weather.RAINY);
        cristoferRobin.live(theHighestLocationInForest);
        cristoferRobin.sitHomeDuringTheRains();
        cristoferRobin.morningCheck(stick, ground, water, road, -6);
        try {
            cristoferRobin.think("Мой дом стал настоящим островом");
        }catch (EmptyStringException e){
            System.out.println(e.getMessage());
        }






        System.out.println("Описание всех объектов:");
        System.out.println("Puh:" + puh);
        System.out.println("FloatingBear:" + bear);
        System.out.println("CristoferRobin:" + cristoferRobin);
        System.out.println("HouseCristofers:" + house);
        System.out.println("LowlandForest:" + lowlandForest);
        System.out.println("TheHighestLocationInForest:" + theHighestLocationInForest);
        System.out.println("Dispute:" + dispute);
        System.out.println("Door:" + door);
        System.out.println("TheBiggestPots:" + theBiggestPot);
        System.out.println("Wood:" + wood);
        System.out.println("Branch" + branch);
        System.out.println("Water:" + water);
        System.out.println("RescueOperation:" + rescueOperation);
        System.out.println("Bottle:" + bottle);
        System.out.println("Paper:" + paper);
        System.out.println("Stick:" + stick);
        System.out.println("Ground" + ground);
        System.out.println("Road:" + road);
    }
}