package com.fatec.integration;

import com.fatec.controller.dto.response.Temperatura;
import com.fatec.controller.dto.response.WeatherResponse;
import com.fatec.integration.externo.LocalComFeign;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LocalIntegrationImpl {

    private final LocalComFeign feign;

    public LocalIntegrationImpl(LocalComFeign feign) {
        this.feign = feign;
    }

    public WeatherResponse buscarClima(double lat, double lon) {

        String json = feign.getWeather(lat, lon, true);

        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> data = mapper.readValue(json, Map.class);

            Map<String, Object> current =
                    (Map<String, Object>) data.get("current_weather");

            WeatherResponse response = new WeatherResponse();
            Temperatura temp = new Temperatura();

            temp.setDatahora((String) current.get("time"));
            temp.setTemperatura((Double) current.get("temperature"));
            temp.setUnidadeTemperatura("°C");
            temp.setUnidadeVento("km/h");

            response.setTempoZona("Atual");
            response.setTemperatura(temp);

            return response;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao processar clima", e);
        }
    }
}