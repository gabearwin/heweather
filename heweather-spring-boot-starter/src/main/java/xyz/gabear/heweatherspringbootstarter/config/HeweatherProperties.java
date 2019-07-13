package xyz.gabear.heweatherspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "heweather")
public class HeweatherProperties {
    public static final String DEFAULT_URL = "https://free-api.heweather.net/s6/weather/";
    /**
     * 和风天气 API URL 前缀
     */
    private String url = DEFAULT_URL;
    /**
     * 和风天气账户 key
     */
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
