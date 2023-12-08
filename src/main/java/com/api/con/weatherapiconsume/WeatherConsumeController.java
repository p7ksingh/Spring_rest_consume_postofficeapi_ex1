package com.api.con.weatherapiconsume;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WeatherConsumeController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String getWeatherReport() {

        return weatherService.getWeatherReport();
    }
}
