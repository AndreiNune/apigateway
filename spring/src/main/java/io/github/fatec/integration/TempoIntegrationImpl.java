package io.github.fatec.integration;
    
import org.springframework.stereotype.Component;

import io.github.fatec.controller.adapter.TempoControllerAdapter;
import io.github.fatec.controller.dto.request.TempoRequest;
import io.github.fatec.entity.Tempo;
import io.github.fatec.integration.externo.TempoComFeign;

@Component
public class TempoIntegrationImpl implements TempoIntegration {

    private final TempoComFeign tempoComFeign;

    public TempoIntegrationImpl(TempoComFeign tempoComFeign) {
        this.tempoComFeign = tempoComFeign;
    }

    @Override
    public Tempo buscaTempo(String lat, String lon) {
        TempoRequest request = tempoComFeign.buscaTempo(lat, lon);
        if (request == null) {
            throw new RuntimeException("Resposta da API de tempo vazia");
        }
        return TempoControllerAdapter.castRequest(request);
    }
}
