package com.denisdnepr66.tasks;

import com.denisdnepr66.tasks.domain.Task;
import com.denisdnepr66.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task(1L, "Create SpringBoot Application", LocalDate.now(), false));
            taskService.save(new Task(2L, "Create Spring Project Packages", LocalDate.now(), false));
            taskService.save(new Task(3L, "Create The Task Domain Class", LocalDate.now(), false));
            taskService.save(new Task(4L, "Create service and repository classes", LocalDate.now(), false));
        };
    }

}
