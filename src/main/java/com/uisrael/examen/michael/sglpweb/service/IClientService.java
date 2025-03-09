package com.uisrael.examen.michael.sglpweb.service;

import java.util.List;

import com.uisrael.examen.michael.sglpweb.model.Client;

public interface IClientService {

    public boolean crearClient (Client client);
    public List<Client> findAllClients(); 
}
