package io.github.fatec.repository.file;

import io.github.fatec.entity.Tempo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;

public class TempoFileRepository {
    private static final String FILE_PATH = "dados_tempo.txt";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Tempo save(Tempo tempo) {
        return save(tempo, null);
    }

    public Tempo save(Tempo tempo, String respostaApiCompleta) {
        try {
            Files.write(
                    Paths.get(FILE_PATH),
                    (formatarTempo(tempo) + System.lineSeparator()).getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            System.out.println("Tempo salvo em: " + FILE_PATH);
            return tempo;
        } catch (IOException e) {
            System.err.println("Erro ao salvar no arquivo: " + e.getMessage());
            throw new RuntimeException("Erro ao persistir dados", e);
        }
    }

    private String formatarTempo(Tempo tempo) {
        return String.format(
            "resposta=%s | tempoZona=%s | dataHora=%s | temperaturaDia=%s | unidadeTemperaturaDia=%s | vento=%s | unidadeVento=%s",
            "ok",
            tempo.tempoZona() != null ? tempo.tempoZona() : "N/A",
            tempo.dataHora() != null ? dateFormat.format(tempo.dataHora()) : "N/A",
            tempo.temperaturaDia() != null ? tempo.temperaturaDia() : "N/A",
            tempo.unidadeTemperaturaDia() != null ? tempo.unidadeTemperaturaDia() : "N/A",
            tempo.vento() != null ? tempo.vento() : "N/A",
            tempo.unidadeVento() != null ? tempo.unidadeVento() : "N/A"
        );
    }
}
