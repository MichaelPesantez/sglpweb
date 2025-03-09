package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.Task;
import com.uisrael.examen.michael.sglpweb.repository.ITaskRepository;
import com.uisrael.examen.michael.sglpweb.service.ITaskService;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private ITaskRepository repository;

    @Override
    public boolean crearTask(Task task) {
        try 
        {
            repository.save(task);
            return true;
        } 
        catch (Exception e) 
        {

            throw(e);
        }
     }

}
