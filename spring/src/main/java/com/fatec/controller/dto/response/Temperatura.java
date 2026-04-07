package com.fatec.controller.dto.response;

public class Temperatura {

    private String datahora;
    private double temperatura;
    private String unidadeTemperatura;
    private String unidadeVento;

    public String getDatahora() {
        return datahora;
    }

    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidadeTemperatura() {
        return unidadeTemperatura;
    }

    public void setUnidadeTemperatura(String unidadeTemperatura) {
        this.unidadeTemperatura = unidadeTemperatura;
    }

    public String getUnidadeVento() {
        return unidadeVento;
    }

    public void setUnidadeVento(String unidadeVento) {
        this.unidadeVento = unidadeVento;
    }
}