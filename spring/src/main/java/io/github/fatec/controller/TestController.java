package io.github.fatec.controller;

import io.github.fatec.controller.adapter.TempoControllerAdapter;
import io.github.fatec.controller.dto.response.TempoResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.fatec.entity.Tempo;
import io.github.fatec.integration.TempoIntegration;
import io.github.fatec.repository.TempoRepository;


@RestController
public class TestController {

    private final TempoIntegration tempoIntegration;
    private final TempoRepository tempoRepository;

    public TestController(TempoIntegration tempoIntegration, TempoRepository tempoRepository) {
        this.tempoIntegration = tempoIntegration;
        this.tempoRepository = tempoRepository;
    }

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        String lat = "-23.5505";
        String lon = "-46.6333";
        return ResponseEntity.ok(tempoIntegration.buscaTempo(lat, lon));
    }

    @GetMapping("/tempo/consulta")
    public ResponseEntity<Tempo> consultaTempo(
            @RequestParam String lat,
            @RequestParam String lon) {
        return ResponseEntity.ok(tempoIntegration.buscaTempo(lat, lon));
    }

    @GetMapping("/tempo/salvar")
    public ResponseEntity<TempoResponse> salvarTempo(
            @RequestParam String lat,
            @RequestParam String lon) {
        Tempo tempo = tempoIntegration.buscaTempo(lat, lon);
        Tempo salvo = tempoRepository.salve(tempo);
        TempoResponse resposta = TempoControllerAdapter.castResponse(salvo);

        return ResponseEntity.ok(resposta);
    }

}
