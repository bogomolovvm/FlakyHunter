package com.bvm.flakyhunter.models.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "test_runs")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class TestRun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Column(name = "run_at", nullable = false)
    private Instant runAt;

    @Column(name = "total_tests", nullable = false)
    private Integer totalTests;

    @Column(name = "file_name")
    private String fileName;
}
