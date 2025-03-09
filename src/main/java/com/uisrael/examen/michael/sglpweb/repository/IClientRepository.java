package com.uisrael.examen.michael.sglpweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.examen.michael.sglpweb.model.Client;

public interface IClientRepository extends JpaRepository<Client, Integer> {

    @Query("Select c from Client c")
    public List<Client> findAllClients();
}
