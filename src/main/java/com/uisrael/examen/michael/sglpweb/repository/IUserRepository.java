package com.uisrael.examen.michael.sglpweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.examen.michael.sglpweb.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
