package com.bvm.flakyhunter.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class IngestController {

    @PostMapping("/api/ingest")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

        return ResponseEntity.accepted().build();
    }
}
