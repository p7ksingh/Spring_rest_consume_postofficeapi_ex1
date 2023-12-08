package com.api.con.weatherapiconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostOfficeService {
    @Autowired
    RestTemplate restTemplate;

    public String getPostOffice() {
        String report = restTemplate.getForObject(
                "https://api.postalpincode.in/pincode/844122",
                String.class);
        return report;
    }

}
