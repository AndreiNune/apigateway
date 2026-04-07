package io.github.fatec.repository.adapter;

import io.github.fatec.entity.Tempo;

public class TempoRepositoryAdapter {
    private TempoRepositoryAdapter() {
    }

    public static Tempo castOrm(Tempo orm) {
        return new Tempo(
                orm.tempoZona(),
                orm.dataHora(),
                orm.temperaturaDia(),
                orm.unidadeTemperaturaDia(),
                orm.vento(),
                orm.unidadeVento());
    }

    public static Tempo castEntity(Tempo entity) {
        return castOrm(entity);
    }
}
