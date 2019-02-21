package com.main.project.services;

import com.main.project.entity.Project;
import com.main.project.repositories.ProjectRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        //Logic

        return projectRepository.save(project);
    }
    public Optional<Project> getProject(Long id){

        //Logic

        return projectRepository.findById(id);
    }
    

}
