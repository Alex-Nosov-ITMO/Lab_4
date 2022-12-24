package objects;

import Heroes.Hero;
import util.Water;

import java.util.Objects;

public class Wood extends PhisicalObject{
    public Wood(String name, Size size){
        super(name, size);
    }


    public class Branch{
        private String name;
        private Size size;

        public Branch(String name, Size size){
            this.setName(name);
            this.setSize(size);
        }

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public Size getSize(){
            return this.size;
        }
        public String getSizeDescription(){
            return this.size.getSizeDescription();
        }
        public void setSize(Size size){
            this.size = size;
        }


        public void stickOut(Water water) {
            System.out.println(this.getName() + " высоко-высоко торчит из " + water.getName());
        }


        @Override
        public String toString() {
            return this.getClass().getName() + "["
                    + "name==" + this.getName() + ", size==" + this.getSizeDescription();
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, size);
        }

        @Override
        public boolean equals(Object oth) {
            if (this == oth) return true;
            if (oth == null) return false;
            if (!oth.getClass().equals(this.getClass())) return false;
            Branch other = (Branch) oth;
            return name.equals(other.name) && size.equals(other.size);
        }
    }
}
