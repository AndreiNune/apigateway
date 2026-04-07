package com.fatec.service;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class ArchiveService {

    private static final String FILE_PATH = "tempo.txt";

    public void salvar(String conteudo) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(conteudo + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}