package com.fatec.integration.externo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "openMeteo",
        url = "https://api.open-meteo.com"
)
public interface LocalComFeign {

    @GetMapping("/v1/forecast")
    String getWeather(
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude,
            @RequestParam("current_weather") boolean currentWeather
    );
}
