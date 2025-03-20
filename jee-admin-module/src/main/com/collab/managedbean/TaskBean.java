package com.collab.managedbean;

import com.collab.ejb.TaskService;
import com.collab.model.Task;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TaskBean {
    @EJB
    private TaskService taskService;
    private Task task = new Task();

    public void saveTask() {
        taskService.createTask(task);
        task = new Task();
    }

    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Getters/Setters
    public Task getTask() { return task; }
    public void setTask(Task task) { this.task = task; }
}