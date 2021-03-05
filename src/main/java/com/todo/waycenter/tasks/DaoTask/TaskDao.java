package com.todo.waycenter.tasks.DaoTask;


import com.todo.waycenter.tasks.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository<Task,Integer> {
}
