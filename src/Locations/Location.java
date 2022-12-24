package Locations;
import java.util.Objects;
public abstract class Location {
    private String name = "Без имени";

    public Location(String name){
        if(name != null) this.name = name;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public String toString() {

        return getClass().getName()+"["
                + "name=" + this.name +"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;

        Location other = (Location) oth;

        return Objects.equals(name, other.name);
    }
}
