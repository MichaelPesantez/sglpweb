package com.uisrael.examen.michael.sglpweb.service;

import java.util.List;

import com.uisrael.examen.michael.sglpweb.model.LegalCase;

public interface ILegalCaseService {

    public boolean crearLegalCase(LegalCase legalCase);
    public LegalCase save(LegalCase legalCase);
    public List<LegalCase> findAll();
}
