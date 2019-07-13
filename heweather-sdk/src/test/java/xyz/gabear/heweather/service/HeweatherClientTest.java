package xyz.gabear.heweather.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.gabear.heweather.client.HeweatherClient;
import xyz.gabear.heweather.client.HeweatherClientImpl;

@RunWith(SpringRunner.class)
public class HeweatherClientTest {

    @Test
    public void testGetCommonWeather() {
        HeweatherClient client = new HeweatherClientImpl("aaa", "bbb");
        client.getCommonWeather();
    }
}