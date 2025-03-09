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
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date limitDate;

    @ManyToOne
    @JoinColumn(name = "fkCaseTask")
    private LegalCase fkCaseTask;

   @OneToMany(mappedBy = "fkTaskTracking")
   List<TaskTracking> taskTrackings;

   @ManyToOne
   @JoinColumn(name = "fkTaskPriority")
   private Priority fkTaskPriority;

   @ManyToOne
   @JoinColumn(name = "fkTaskStatus")
   private TaskStatus fkTaskStatus;

   @ManyToOne
   @JoinColumn(name = "fkUserTask")
   private User fkUserTask;
}
