/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.entity.Project;
import com.example.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sgandham
 */

public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    
    public Project saveUpdateProject(Project project){
        return projectRepository.save(project);
    }
}
