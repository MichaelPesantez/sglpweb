package com.uisrael.examen.michael.sglpweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.examen.michael.sglpweb.model.LegalCase;

public interface ILegalCaseRepository extends JpaRepository<LegalCase, Integer> {
    

}
