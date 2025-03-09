package com.uisrael.examen.michael.sglpweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.Client;
import com.uisrael.examen.michael.sglpweb.repository.IClientRepository;
import com.uisrael.examen.michael.sglpweb.service.IClientService;

@Service
public class ClientService implements IClientService{

    @Autowired
    private IClientRepository repositorie;

    @Override
    public boolean crearClient(Client client) {
        try {
            repositorie.save(client);
            return true;
        } 
        catch (Exception e) 
        {
            throw(e);
        }
    }

    @Override
    public List<Client> findAllClients() {
       return repositorie.findAll();
    }

}
