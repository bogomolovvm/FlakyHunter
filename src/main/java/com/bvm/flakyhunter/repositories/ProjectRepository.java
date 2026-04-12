package com.bvm.flakyhunter.repositories;

import com.bvm.flakyhunter.models.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
