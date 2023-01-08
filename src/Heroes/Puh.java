package Heroes;


import objects.PhisicalObject;
import objects.Wood;
import interfaces.Lookable;
import util.Dispute;

public class Puh extends Hero implements Lookable {
    public Puh(String name, boolean disputemember){
        super(name, disputemember);
    }

    @Override
    public void ride(Hero a) {
        System.out.println(this.getName() + " ехал на " + a.getName() + this.dangleFeet());
    }

    public String dangleFeet (){
        return ", болтая ногами";
    }

    public void cameUp(PhisicalObject object){
        System.out.println(this.getName() + " подошел к " + object.getName());
    }

    public void lookOut(){
        System.out.println(this.getName() + " выглянул наружу.");
    }

    public void capture(PhisicalObject object){
        System.out.println(this.getName() + " схватил " + object.getSizeDescription() + " " + object.getName());
    }

    public String tearsFromTheBranch(){
        return (this.getName() + " слез с ветки");
    }

    public void climbUp(Wood.Branch branch, PhisicalObject object){


        System.out.println(this.getName() + " залез с " + object.getName() + " на " + branch.getName());
    }


    public void sitOnBranch(Wood.Branch branch){
        System.out.println(this.getName() + " сидел на " + branch.getName() + this.dangleFeet() + ", вместе с горшками");
        System.out.println("Однако дни шли, а мед кончался.");
    }


    public void jumpedOff(){
        System.out.println(this.getName() + " спрыгнул вниз");
    }

    public void pullOut(PhisicalObject object1, PhisicalObject object2){
        System.out.println(this.getName() + " вытащил " + object1.getName() + " из " + object2.getName());
    }

    @Override
    public void lookAtSomething(PhisicalObject object) {
        System.out.println(this.getName() + " посмотрел на " + object.getName());
    }


    @Override
    public void lookAtSomeone(Hero hero) {
        System.out.println(this.getName() + " посмотрел на " + hero.getName());
    }


    public void throwSomething(PhisicalObject object){
        System.out.println(this.getName() + " бросил " + object.getSizeDescription() + " " + object.getName() + " и прыгнул вслед.");
    }
}
