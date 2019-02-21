package io.agileintelligence.ppmtool.repositories;

import com.example.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {


}
