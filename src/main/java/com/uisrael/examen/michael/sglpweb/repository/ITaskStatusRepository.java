package com.uisrael.examen.michael.sglpweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.examen.michael.sglpweb.model.TaskStatus;

public interface ITaskStatusRepository extends JpaRepository<TaskStatus, Integer> {

}
