package interfaces;

import Heroes.Hero;
import objects.PhisicalObject;

public interface Lookable {
    public void lookAtSomeone(Hero hero);

    public void lookAtSomething(PhisicalObject object);
}
