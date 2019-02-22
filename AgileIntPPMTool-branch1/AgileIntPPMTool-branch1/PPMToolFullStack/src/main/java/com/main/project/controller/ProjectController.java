package com.main.project.controller;


import com.main.project.entity.Project;
import com.main.project.services.ProjectService;
import com.main.project.services.BindingResultValidationError;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.repository.util.ReactiveWrapperConverters.map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    
    @Autowired
    private BindingResultValidationError validationError;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@RequestBody Project project, BindingResult result){
//        
//        if(result.hasErrors())
//            return new ResponseEntity<String>("Invalid Project Object", HttpStatus.BAD_REQUEST);

            if(result.hasErrors())
                return new ResponseEntity<Map<String,String>>(validationError.mapResults(result),HttpStatus.BAD_REQUEST);
            
        
        Project project1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project1, HttpStatus.CREATED);
    }
    
    @GetMapping("{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectService.getProject(id);
    }
}
