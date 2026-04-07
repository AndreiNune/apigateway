package io.github.fatec.controller.adapter;

import io.github.fatec.controller.dto.request.TempoRequest;
import io.github.fatec.controller.dto.response.TempoResponse;
import io.github.fatec.entity.Tempo;

import java.util.Date;

public class TempoControllerAdapter {
    private TempoControllerAdapter() {
    }

    public static Tempo castRequest(TempoRequest request) {
        String tempoZona = request.getTimezone();
        Date dataHora = new Date();
        Double temperatura = null;
        String unidadeTemperatura = null;
        Double vento = null;
        String unidadeVento = null;

        if (request.getCurrent_weather() != null) {
            temperatura = request.getCurrent_weather().getTemperature();
            vento = request.getCurrent_weather().getWindspeed();
        }

        if (request.getCurrent_weather_units() != null) {
            unidadeTemperatura = request.getCurrent_weather_units().getTemperature();
            unidadeVento = request.getCurrent_weather_units().getWindspeed();
        }

        return new Tempo(
            tempoZona,
                dataHora,
                temperatura,
                unidadeTemperatura,
                vento,
                unidadeVento);
    }

    public static TempoResponse castResponse(Tempo tempo) {
        TempoResponse.Temperatura temperatura = new TempoResponse.Temperatura(
            tempo.dataHora(),
            tempo.temperaturaDia(),
            tempo.unidadeTemperaturaDia(),
            tempo.vento(),
            tempo.unidadeVento());

        return new TempoResponse(
            tempo.tempoZona(),
            temperatura);
    }
}
