package com.uisrael.examen.michael.sglpweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.examen.michael.sglpweb.model.CaseStatus;

public interface ICaseStatusRepository extends JpaRepository<CaseStatus, Integer>{

    @Query("Select c from CaseStatus c")
    public List<CaseStatus> findAll();
}
