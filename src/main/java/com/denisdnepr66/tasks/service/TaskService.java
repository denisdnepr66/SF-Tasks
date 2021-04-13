package com.denisdnepr66.tasks.service;

import com.denisdnepr66.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
