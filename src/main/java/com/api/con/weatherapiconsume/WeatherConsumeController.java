package com.api.con.weatherapiconsume;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WeatherConsumeController {

    @Autowired
    PostOfficeService postOfficeService;

    @GetMapping("/")
    public String getPostOfficeReport() {

        return postOfficeService.getPostOffice();
    }
}
