package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.User;
import com.uisrael.examen.michael.sglpweb.repository.IUserRepository;
import com.uisrael.examen.michael.sglpweb.service.IUserService;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Override
    public boolean crearUser(User user) {
        try {
            repository.save(user);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }

}
