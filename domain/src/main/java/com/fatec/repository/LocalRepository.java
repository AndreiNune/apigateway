package com.fatec.repository;

import com.fatec.entity.Local;
import org.springframework.stereotype.Repository;

@Repository
public class LocalRepository {

    public Local save(Local local) {
        // simula persistência
        return local;
    }
}