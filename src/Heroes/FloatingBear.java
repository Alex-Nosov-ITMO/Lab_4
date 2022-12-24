package Heroes;



public class FloatingBear extends Hero{
    public FloatingBear(String name, boolean disputemember){
        super(name, disputemember);
    }

    @Override
    public void ride(Hero a) {
        System.out.println(this.getName() + this.ruthlesslyCrush() + a.getName());
    }

    public String ruthlesslyCrush(){
        return ", безжалостно давя, ехал на ";
    }
}
