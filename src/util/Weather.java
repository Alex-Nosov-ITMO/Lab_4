package util;

public enum Weather {
    SUNNY("Солнечно"),
    CLOUDY("Облачно"),
    FOGGY("Туманно"),
    RAINY("Дождь льет, льет и льет"),
    SNOWFALL("Снегопад");
    private final String weather;
    Weather(String weather)
    {
        this.weather = weather;
    }

    public String getWeatherDescription(){

        return this.weather;
    }
}
