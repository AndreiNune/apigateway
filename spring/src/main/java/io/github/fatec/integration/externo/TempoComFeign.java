package io.github.fatec.integration.externo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.fatec.controller.dto.request.TempoRequest;

@FeignClient(
        name = "ApiTempo",
        url = "https://api.open-meteo.com/v1")
public interface TempoComFeign {
    @GetMapping("/forecast?latitude={lat}&longitude={lon}&current_weather=true")
    TempoRequest buscaTempo(@PathVariable("lat") String lat, @PathVariable("lon") String lon);
}
