package com.uisrael.examen.michael.sglpweb.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Cedula del cliente
    private String clientId;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String address;

    @OneToMany(mappedBy = "fkCaseClient")
    List<LegalCase> cases;

}
