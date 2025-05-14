package ru.nsu.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.common.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {



}
