package com.fatec.controller;

import com.fatec.controller.dto.request.LocalRequest;
import com.fatec.controller.dto.response.LocalResponse;
import com.fatec.controller.adapter.LocalControllerAdapter;
import com.fatec.controller.dto.response.WeatherResponse;
import com.fatec.integration.LocalIntegrationImpl;
import com.fatec.repository.LocalRepository;
import com.fatec.service.ArchiveService;
import org.springframework.web.bind.annotation.*;
import com.fatec.entity.Local;

@RestController
@RequestMapping("/locais")
public class LocalController {

    private final LocalRepository localRepository;
    private final LocalIntegrationImpl integration;
    private final ArchiveService archService; // 👈 FALTAVA ISSO

    public LocalController(LocalRepository localRepository,
                           LocalIntegrationImpl integration,
                           ArchiveService archService) {
        this.localRepository = localRepository;
        this.integration = integration;
        this.archService = archService;
    }

    @PostMapping
    public LocalResponse salvar(@RequestBody LocalRequest request) {
        Local local = LocalControllerAdapter.castRequest(request);
        Local localSalvo = localRepository.save(local); // 👈 ver nota abaixo
        return LocalControllerAdapter.castResponse(localSalvo);
    }

    @GetMapping("/clima")
    public WeatherResponse buscarClima(
            @RequestParam double lat,
            @RequestParam double lon
    ) {
        WeatherResponse clima = integration.buscarClima(lat, lon);

        archService.salvar(
                "Tempo Zona: " + clima.getTempoZona() +
                        " | Data/Hora: " + clima.getTemperatura().getDatahora() +
                        " | Temperatura: " + clima.getTemperatura().getTemperatura() +
                        " | Unidade Temp: " + clima.getTemperatura().getUnidadeTemperatura() +
                        " | Unidade Vento: " + clima.getTemperatura().getUnidadeVento()
        );

        return clima;
    }
}