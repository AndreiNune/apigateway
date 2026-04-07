package io.github.fatec.entity;

import java.util.Date;
import java.util.Objects;

public class Tempo {
    private String tempoZona;
    private Date dataHora;
    private Double temperaturaDia;
    private String unidadeTemperaturaDia;
    private Double vento;
    private String unidadeVento;

    public Tempo(String tempoZona, Date dataHora, Double temperaturaDia, String unidadeTemperaturaDia, Double vento, String unidadeVento) {
        this.tempoZona = tempoZona;
        this.dataHora = dataHora;
        this.temperaturaDia = temperaturaDia;
        this.unidadeTemperaturaDia = unidadeTemperaturaDia;
        this.vento = vento;
        this.unidadeVento = unidadeVento;
    }

    public String tempoZona() {
        return tempoZona;
    }

    public Date dataHora() {
        return dataHora;
    }

    public Double temperaturaDia() {
        return temperaturaDia;
    }

    public String unidadeTemperaturaDia() {
        return unidadeTemperaturaDia;
    }

    public Double vento() {
        return vento;
    }

    public String unidadeVento() {
        return unidadeVento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tempo tempo = (Tempo) o;
        return Objects.equals(tempoZona, tempo.tempoZona) &&
            Objects.equals(dataHora, tempo.dataHora) &&
            Objects.equals(temperaturaDia, tempo.temperaturaDia) &&
            Objects.equals(unidadeTemperaturaDia, tempo.unidadeTemperaturaDia) &&
            Objects.equals(vento, tempo.vento) &&
            Objects.equals(unidadeVento, tempo.unidadeVento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tempoZona, dataHora, temperaturaDia, unidadeTemperaturaDia, vento, unidadeVento);
    }

    @Override
    public String toString() {
        return "Tempo{" +
                "tempoZona='" + tempoZona + '\'' +
                ", dataHora=" + dataHora +
                ", temperaturaDia=" + temperaturaDia +
                ", unidadeTemperaturaDia='" + unidadeTemperaturaDia + '\'' +
                ", vento=" + vento +
                ", unidadeVento='" + unidadeVento + '\'' +
                '}';
    }
}