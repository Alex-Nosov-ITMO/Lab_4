package util;

import Heroes.Hero;

import java.util.Objects;

public class Ground {
    private String name;

    public Ground(String name){
        this.setName(name);
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public String toString() {
        return this.getClass().getName() + "[" + " name==" + this.name + "]";
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
        Ground other = (Ground) oth;
        return name.equals(other.name);
    }
}

