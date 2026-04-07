package io.github.fatec.repository;

import org.springframework.stereotype.Repository;

import io.github.fatec.entity.Tempo;
import io.github.fatec.repository.file.TempoFileRepository;

@Repository
public class TempoRepositoryImpl implements TempoRepository {

    private final TempoFileRepository fileRepository;

    public TempoRepositoryImpl() {
        this.fileRepository = new TempoFileRepository();
    }

    @Override
    public Tempo salve(Tempo tempo) {
        return fileRepository.save(tempo);
    }

    @Override
    public Tempo salve(Tempo tempo, String respostaApiCompleta) {
        return fileRepository.save(tempo, respostaApiCompleta);
    }
}
