package com.example.todolists.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo
{
    @Id
    private long Id;
    private String Task;
    private String description;
    private String DueTime;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueTime() {
        return DueTime;
    }

    public void setDueTime(String dueTime) {
        DueTime = dueTime;
    }


}
