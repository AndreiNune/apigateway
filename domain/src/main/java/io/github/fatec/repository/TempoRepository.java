package io.github.fatec.repository;

import io.github.fatec.entity.Tempo;

public interface TempoRepository {
    Tempo salve(Tempo Tempo);
    Tempo salve(Tempo tempo, String respostaApiCompleta);
}