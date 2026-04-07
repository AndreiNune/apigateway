package com.fatec.controller.adapter;

import com.fatec.controller.dto.response.LocalResponse;
import com.fatec.controller.dto.request.LocalRequest;
import com.fatec.entity.Local;

public class LocalControllerAdapter {

        private LocalControllerAdapter() {
        }

        public static Local castRequest(LocalRequest request) {
            return new Local(
                    request.datahora(),
                    request.temperaturaDia(),
                    request.unidadeTemperaturaDia(),
                    request.vento(),
                    request.unidadeVento()
            );
        }

        public static LocalResponse castResponse(Local local) {
            return new LocalResponse(
                    local.datahora(),
                    local.temperaturaDia(),
                    local.unidadeTemperaturaDia(),
                    local.vento(),
                    local.unidadeVento()
            );
        }
    }


