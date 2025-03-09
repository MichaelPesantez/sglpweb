package com.uisrael.examen.michael.sglpweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.LegalCase;
import com.uisrael.examen.michael.sglpweb.repository.ILegalCaseRepository;
import com.uisrael.examen.michael.sglpweb.service.ILegalCaseService;

@Service
public class LegalCaseService implements ILegalCaseService {

    @Autowired
    private ILegalCaseRepository repository;

    @Override
    public boolean crearLegalCase(LegalCase legalCase) {
        try {
            repository.save(legalCase);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }

    @Override
    public LegalCase save(LegalCase legalCase) {
        return repository.save(legalCase);
    }

    @Override
    public List<LegalCase> findAll() {
      return repository.findAll();
    }


}
