package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.Term;
import com.uisrael.examen.michael.sglpweb.repository.ITermRepository;
import com.uisrael.examen.michael.sglpweb.service.ITermService;

@Service
public class TermService implements ITermService {

    @Autowired
    private ITermRepository repository;

    @Override
    public boolean crearTerm(Term term) {
        try {
            repository.save(term);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }

}
