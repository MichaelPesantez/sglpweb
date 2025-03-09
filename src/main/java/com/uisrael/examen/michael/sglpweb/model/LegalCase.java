package com.uisrael.examen.michael.sglpweb.model;

import java.util.Date;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class LegalCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String typeCase;
    private String details;

    @Temporal(TemporalType.DATE)
    private Date beginDate;

    @ManyToOne
    @JoinColumn(name = "fkCaseStatus")
    private CaseStatus fkCaseStatus;

    @OneToMany(mappedBy = "fkCaseTerm")
    List<Term> terms;

    @OneToMany(mappedBy = "fkCaseTask")
    List<Task> tasks;

    @ManyToOne
    @JoinColumn(name = "fkCaseClient")
    private Client fkCaseClient;


}
