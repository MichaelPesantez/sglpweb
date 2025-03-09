package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.uisrael.examen.michael.sglpweb.model.Role;
import com.uisrael.examen.michael.sglpweb.repository.IRoleRepository;
import com.uisrael.examen.michael.sglpweb.service.IRoleService;

public class RoleService implements IRoleService {

    @Autowired
    private IRoleRepository repository;

    @Override
    public boolean crearRole(Role role) {
        try {
            repository.save(role);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }

}
