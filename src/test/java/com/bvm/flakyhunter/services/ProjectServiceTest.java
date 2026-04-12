package com.bvm.flakyhunter.services;

import com.bvm.flakyhunter.models.entities.Project;
import com.bvm.flakyhunter.repositories.ProjectRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceTest {
    @Mock
    ProjectRepository repository;

    ProjectService service;

    @BeforeEach
    void setup() {
        service = new ProjectService(repository);
    }

    @Test
    void projectGeneratesWRandomUUID() {
        Project p = new Project();
        p.setName("Test");
        p.setApiKey("Test");

        when(repository.save(p)).thenReturn(p);

        Project result = service.createProject("Test");

        verify(repository, times(1)).save(p);
        assertNotNull(result.getApiKey());
    }
}