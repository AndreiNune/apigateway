package io.github.fatec.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class TempoResponse {
    private String tempoZona;

    @JsonProperty("temperatura")
    private Temperatura temperatura;

    public TempoResponse() {}

    public TempoResponse(String tempoZona, Temperatura temperatura) {
        this.tempoZona = tempoZona;
        this.temperatura = temperatura;
    }

    public String getTempoZona() { return tempoZona; }
    public void setTempoZona(String tempoZona) { this.tempoZona = tempoZona; }
    public Temperatura getTemperatura() { return temperatura; }
    public void setTemperatura(Temperatura temperatura) { this.temperatura = temperatura; }

    public static class Temperatura {
        private Date dataHora;
        private Double temperaturaDia;
        private String unidadeTemperaturaDia;
        private Double vento;
        private String unidadeVento;

        public Temperatura() {}

        public Temperatura(Date dataHora, Double temperaturaDia, String unidadeTemperaturaDia, Double vento, String unidadeVento) {
            this.dataHora = dataHora;
            this.temperaturaDia = temperaturaDia;
            this.unidadeTemperaturaDia = unidadeTemperaturaDia;
            this.vento = vento;
            this.unidadeVento = unidadeVento;
        }

        public Date getDataHora() { return dataHora; }
        public void setDataHora(Date dataHora) { this.dataHora = dataHora; }
        public Double getTemperaturaDia() { return temperaturaDia; }
        public void setTemperaturaDia(Double temperaturaDia) { this.temperaturaDia = temperaturaDia; }
        public String getUnidadeTemperaturaDia() { return unidadeTemperaturaDia; }
        public void setUnidadeTemperaturaDia(String unidadeTemperaturaDia) { this.unidadeTemperaturaDia = unidadeTemperaturaDia; }
        public Double getVento() { return vento; }
        public void setVento(Double vento) { this.vento = vento; }
        public String getUnidadeVento() { return unidadeVento; }
        public void setUnidadeVento(String unidadeVento) { this.unidadeVento = unidadeVento; }
    }
}
