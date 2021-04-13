package com.denisdnepr66.tasks.repository;

import com.denisdnepr66.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
