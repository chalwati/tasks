package com.todo.waycenter.tasks.controller;
import com.todo.waycenter.tasks.DaoTask.TaskDao;
import com.todo.waycenter.tasks.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://angular-taskswaycenter-todo.herokuapp.com")
@RestController
public class TaskController {

    @Autowired
    private TaskDao TaskDao ;

    @GetMapping(value="/tasks")
    public List<Task> allTasks (){
         List<Task> tasks = TaskDao.findAll();
         return tasks;
     }

    @GetMapping(value="tasks/{id}")
    public Task oneTask(@PathVariable Integer id){
         Optional<Task> task = TaskDao.findById(id);
         return task.get() ;
     }


    @PostMapping(value = "/add-task")
    public ResponseEntity<Void> addTask(@Validated @RequestBody Task task) {

        Task taskAdded = TaskDao.save(task);

        if (taskAdded == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(taskAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }



    @PutMapping(value = "/update-task")
    public void updateProduct(@RequestBody Task task) {
        TaskDao.save(task);
    }

}
