package com.todo.waycenter.tasks.controller;
import com.todo.waycenter.tasks.DaoTask.TaskDao;
import com.todo.waycenter.tasks.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

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



}
