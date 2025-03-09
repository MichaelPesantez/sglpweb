package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.uisrael.examen.michael.sglpweb.model.Priority;
import com.uisrael.examen.michael.sglpweb.repository.IPriorityRepository;
import com.uisrael.examen.michael.sglpweb.service.IPriorityService;

public class PriorityService implements IPriorityService {

    @Autowired
    private IPriorityRepository repository;

    @Override
    public boolean crearPriority(Priority priority) {
        try {
            repository.save(priority);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }


}
