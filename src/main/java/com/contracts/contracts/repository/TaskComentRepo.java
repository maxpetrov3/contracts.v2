package com.contracts.contracts.repository;

import com.contracts.contracts.models.TaskComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskComentRepo extends JpaRepository<TaskComment, Long> {
}
