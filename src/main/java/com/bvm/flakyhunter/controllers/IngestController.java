package com.bvm.flakyhunter.controllers;

import com.bvm.flakyhunter.models.entities.Project;
import com.bvm.flakyhunter.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class IngestController {

    private final ProjectService projectService;

    @PostMapping("/api/ingest")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

        return ResponseEntity.accepted().build();
    }

    @PostMapping("/api/create")
    public ResponseEntity<Project> createProject(@RequestParam String name) {
        Project p = projectService.createProject(name);
        return ResponseEntity.ok().body(p);
    }
}
