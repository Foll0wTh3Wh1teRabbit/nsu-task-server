package ru.nsu.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.common.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
