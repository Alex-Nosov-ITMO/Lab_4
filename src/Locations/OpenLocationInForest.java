package Locations;

import util.Weather;

public class OpenLocationInForest extends OpenLocation {
    private String name;
    private Weather weather;

    public OpenLocationInForest(String name){
        super(name);
    }
    public OpenLocationInForest(String name, Weather weather){
        super(name, weather);
    }


    public static class LowlandForest extends OpenLocationInForest{
        public LowlandForest(String name, Weather weather){
            super(name, weather);
            System.out.println(weather.getWeatherDescription());
        }

        public LowlandForest(String name){
            super(name);
        }
    }


    public static class TheHighestLocationInForest extends OpenLocationInForest{
        public TheHighestLocationInForest(String name){
            super(name);
        }
        public TheHighestLocationInForest(String name, Weather weather){
            super(name, weather);
            if (weather.getWeatherDescription().equals(Weather.RAINY.getWeatherDescription())){
                System.out.println("Однако вода от дождя не доходит до " + this.getName());
            }
        }
    }

}
