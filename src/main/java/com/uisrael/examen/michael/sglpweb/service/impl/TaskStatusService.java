package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.TaskStatus;
import com.uisrael.examen.michael.sglpweb.repository.ITaskStatusRepository;
import com.uisrael.examen.michael.sglpweb.service.ITaskStatusService;

@Service
public class TaskStatusService implements ITaskStatusService {

    @Autowired
    private ITaskStatusRepository repository;

    @Override
    public boolean crearTaskStatus(TaskStatus taskStatus) {
        try {
            repository.save(taskStatus);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }

}
