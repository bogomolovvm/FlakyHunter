package com.bvm.flakyhunter.services;

import com.bvm.flakyhunter.models.entities.Project;
import com.bvm.flakyhunter.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(String name) {
        String uuid = UUID.randomUUID().toString();
        Project p = new Project();
        p.setName(name);
        p.setApiKey(uuid);
        return projectRepository.save(p);
    }
}
