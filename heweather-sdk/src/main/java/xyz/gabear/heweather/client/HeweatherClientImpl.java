package xyz.gabear.heweather.client;

public class HeweatherClientImpl implements HeweatherClient {
    private final String url;
    private final String key;

    public HeweatherClientImpl(String url, String key) {
        this.url = url;
        this.key = key;
    }

    @Override
    public void getCommonWeather() {
        System.out.println(String.format("%s/%s?location=%s", url, key, "beijing"));
        System.out.println("We send get request and get weather report information..");
    }

    public String getUrl() {
        return url;
    }

    public String getKey() {
        return key;
    }
}
