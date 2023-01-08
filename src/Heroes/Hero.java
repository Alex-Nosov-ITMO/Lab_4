package Heroes;


import java.util.Objects;

import checkable.EmptyStringException;
import interfaces.Locatable;
import Locations.Location;
import interfaces.DisputeMembers;
import interfaces.Ride;
import interfaces.Think;


public abstract class Hero implements Locatable, DisputeMembers, Ride, Think {
    public Hero(String name, boolean disputemember){
        setName(name);
        setDisputeMember(disputemember);
    }


    private String name;
    private boolean disputemember;


    Location location;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void setDisputeMember(boolean disputemember) {
        this.disputemember = disputemember;
    }

    @Override
    public boolean isDisputeMember() {
        return this.disputemember;
    }

    @Override
    public String locate() {
        return this.location.getName();
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name==" + this.name + ", location=" + this.location + ", disputemember=" + this.disputemember + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, disputemember);
    }


    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;
        Hero other = (Hero) oth;
        return name.equals(other.name) && location.equals(other.location) && disputemember == other.disputemember;
    }


    public void say(String text){
        System.out.println(this.name + " сказал:" + text);
    }


    @Override
    public void ride(Hero a) {
        System.out.println(this.getName() + " едет на " + a.getName());
    }


    @Override
    public void think(String text) throws EmptyStringException {
        if (text == ""){
            throw new EmptyStringException("Ошибка! Мысль пуста!");
        }
        System.out.println(this.getName() + " подумал: " + text);
    }


}

