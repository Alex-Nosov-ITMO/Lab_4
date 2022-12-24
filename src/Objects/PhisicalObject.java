package Objects;
import java.util.Objects;

public abstract class PhisicalObject {
    private String name;
    private Size size;


    public PhisicalObject(String name, Size size){
        this.setName(name);
        this.setSize(size);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
    public String getSizeDescription(){
        return this.size.getSizeDescription();
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }


    @Override
    public String toString() {
        return this.getClass().getName() + "[" +
                "name==" + this.name + ", size==" + this.size + "]";
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;

        PhisicalObject other = (PhisicalObject) oth;
        return name.equals(other.name) && size.equals(other.size);
    }
}
