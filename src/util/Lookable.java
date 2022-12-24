package util;

import Heroes.Hero;
import Objects.PhisicalObject;

public interface Lookable {
    public void lookAtSomeone(Hero hero);

    public void lookAtSomething(PhisicalObject object);
}
