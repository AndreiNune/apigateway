package io.github.fatec.integration;

import io.github.fatec.entity.Tempo;

public interface TempoIntegration {
    Tempo buscaTempo(String lat, String lon);
}
