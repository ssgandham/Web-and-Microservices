/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.entity.Project;
import com.example.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sgandham
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    
    @Autowired
    ProjectService projectService;
    
    @PostMapping("")
    public ResponseEntity saveProject(@RequestBody Project project){
        Project savedProject = projectService.saveUpdateProject(project);
        return new ResponseEntity(project,HttpStatus.CREATED);
    }
}
