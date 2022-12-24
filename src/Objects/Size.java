package Objects;

public enum Size {
    LITTLE ("Маленький"),
    MIDDLE ("Средний"),
    BIG ("Большой"),
    THEBIGEST("Самый большой"),
    VERYSMALL("Очень маленький"),
    THEFATTEST("Толстая-претолстая");

    private final String size;
    Size(String s){size = s;}

    public String getSizeDescription(){
        return this.size;
    }

}