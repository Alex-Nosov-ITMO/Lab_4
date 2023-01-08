package interfaces;

import checkable.EmptyStringException;

public interface Think {
    public void think(String text) throws EmptyStringException;
}
