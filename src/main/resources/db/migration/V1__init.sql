CREATE TABLE projects (
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    api_key    VARCHAR(64)  NOT NULL UNIQUE,
    created_at TIMESTAMPTZ  NOT NULL
);

CREATE TABLE test_runs (
    id         BIGSERIAL PRIMARY KEY,
    project_id BIGINT       NOT NULL REFERENCES projects(id),
    run_at     TIMESTAMPTZ  NOT NULL,
    total_tests INT         NOT NULL DEFAULT 0,
    file_name  VARCHAR(255)
);

CREATE TABLE test_results (
    id          BIGSERIAL PRIMARY KEY,
    run_id      BIGINT       NOT NULL REFERENCES test_runs(id),
    class_name  VARCHAR(512) NOT NULL,
    test_name   VARCHAR(512) NOT NULL,
    suite_name  VARCHAR(255),
    status      VARCHAR(16)  NOT NULL,
    duration_ms BIGINT,
    error_msg   TEXT,
    error_trace TEXT,
    run_at      TIMESTAMPTZ  NOT NULL
);