package com.bvm.flakyhunter.repositories;

import com.bvm.flakyhunter.models.entities.TestRun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRunRepository extends JpaRepository<TestRun, Long> {
}
