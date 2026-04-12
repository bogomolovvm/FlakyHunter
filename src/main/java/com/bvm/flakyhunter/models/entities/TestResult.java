package com.bvm.flakyhunter.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "test_results")
@Getter
@Setter
@NoArgsConstructor
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id", nullable = false)
    private TestRun run;

    @Column(name = "class_name", nullable = false, length = 512)
    private String className;

    @Column(name = "test_name", nullable = false, length = 512)
    private String testName;

    @Column(name = "suite_name")
    private String suiteName;

    @Column(name = "status", nullable = false, length = 16)
    private String status;

    @Column(name = "duration_ms")
    private Long durationMs;

    @Column(name = "error_msg", columnDefinition = "TEXT")
    private String errorMsg;


    @Column(name = "error_trace", columnDefinition = "TEXT")
    private String errorTrace;


    @Column(name = "run_at", nullable = false)
    private Instant runAt;
}
