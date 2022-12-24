package util;

public class Road {

    private String name;

    public Road(String name){
        this.setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void shorten(){
        System.out.println(this.getName() + " стала короче");
    }
}
