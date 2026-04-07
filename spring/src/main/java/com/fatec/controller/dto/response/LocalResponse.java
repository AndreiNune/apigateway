package com.fatec.controller.dto.response;

public record LocalResponse(
        String datahora,
        String temperaturaDia,
        String unidadeTemperaturaDia,
        String vento,
        String unidadeVento) {
}
