package com.fatec.controller.dto.response;

public class WeatherResponse {

    private String tempoZona;
    private Temperatura temperatura;

    public String getTempoZona() {
        return tempoZona;
    }

    public void setTempoZona(String tempoZona) {
        this.tempoZona = tempoZona;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
}