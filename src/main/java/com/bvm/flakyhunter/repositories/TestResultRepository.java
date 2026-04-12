package com.bvm.flakyhunter.repositories;

import com.bvm.flakyhunter.models.entities.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {
}
