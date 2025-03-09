package com.uisrael.examen.michael.sglpweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.CaseStatus;
import com.uisrael.examen.michael.sglpweb.repository.ICaseStatusRepository;
import com.uisrael.examen.michael.sglpweb.service.ICaseStatusService;

@Service
public class CaseStatusService implements ICaseStatusService{

    @Autowired
    private ICaseStatusRepository repositorie;

    @Override
    public boolean crearCaseStatus(CaseStatus caseStatus) {
        
        try{

            repositorie.save(caseStatus);
            return true;
        }catch(Exception e)
        {
            throw(e);
        }
    }

    @Override
    public List<CaseStatus> findAll() {
        return repositorie.findAll();
    }

}
