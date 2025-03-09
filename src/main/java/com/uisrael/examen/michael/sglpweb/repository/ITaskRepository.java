package com.uisrael.examen.michael.sglpweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.examen.michael.sglpweb.model.Task;

public interface ITaskRepository extends JpaRepository<Task, Integer> {

}
