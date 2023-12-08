package com.api.con.weatherapiconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Autowired
    RestTemplate restTemplate;

    public String getWeatherReport() {
        String report = restTemplate.getForObject(
                "https://api.openweathermap.org/data/2.5/weather?lat=28.524720&lon=77.191260&appid=8daf703f4370d556a9462b186bcdb96e",
                String.class);
        return report;
    }

}
