package Locations;

public class CloseLocationInForest extends Location {
    private String name;


    public CloseLocationInForest(String name){
        super(name);
    }

    public static class HouseCristofers extends CloseLocationInForest{
        public HouseCristofers(String name){
            super(name);
        }
    }


}
