package com.uisrael.examen.michael.sglpweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.examen.michael.sglpweb.model.TaskTracking;
import com.uisrael.examen.michael.sglpweb.repository.ITaskTrackingRepository;
import com.uisrael.examen.michael.sglpweb.service.ITaskTrackingService;

@Service
public class TaskTrackingService implements ITaskTrackingService {

    @Autowired
    private ITaskTrackingRepository repository;

    @Override
    public boolean crearTaskTracking(TaskTracking taskTracking) {
        try {
            repository.save(taskTracking);
            return true;
        } catch (Exception e) {
            throw(e);
        }
    }
}
