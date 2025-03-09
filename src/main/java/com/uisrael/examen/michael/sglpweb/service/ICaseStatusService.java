package com.uisrael.examen.michael.sglpweb.service;

import java.util.List;

import com.uisrael.examen.michael.sglpweb.model.CaseStatus;

public interface ICaseStatusService {

    public boolean crearCaseStatus(CaseStatus caseStatus);
    public List<CaseStatus> findAll();
}
