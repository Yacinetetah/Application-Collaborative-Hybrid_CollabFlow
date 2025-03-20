package com.collab.ejb;

import com.collab.model.Task;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TaskService {
    @PersistenceContext
    private EntityManager em;

    public void createTask(Task task) {
        em.persist(task);
    }

    public List<Task> getAllTasks() {
        return em.createQuery("SELECT t FROM Task t", Task.class).getResultList();
    }
}