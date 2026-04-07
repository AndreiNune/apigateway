package com.fatec.controller.dto.request;

public record LocalRequest(
        String datahora,
        String temperaturaDia,
        String unidadeTemperaturaDia,
        String vento,
        String unidadeVento
) {
}


