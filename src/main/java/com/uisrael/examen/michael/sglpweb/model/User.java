package com.uisrael.examen.michael.sglpweb.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Cedula del Usuario
    private String userId;

    private String name;
    private String email;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "fkRole")
    private Role fkRole;

    @OneToMany(mappedBy = "fkUserTask")
    List<Task> tasks;


}
