package com.example.todoBackend.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "todo_item")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "task", nullable = false)
    private String task;

    @Column(name = "completed", nullable = false)
    private int completed;

    @Column(name = "priority", nullable = false)
    private int priority;

    @Column(name = "edited", nullable = false)
    private int edited;

    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;
    

    public TodoItem() {
        super();
    }

    public TodoItem(String task, int completed, int priority, int edited, String createdAt) {
        this.task = task;
        this.completed = completed;
        this.priority = priority;
        this.edited = edited;
        this.createdAt = ZonedDateTime.parse(createdAt);
       }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getEdited() {
        return edited;
    }

    public void setEdited(int edited) {
        this.edited = edited;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    @Override
    public String toString() {
        return "todos{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", completed='" + completed + '\'' +
                ", priority='" + priority + '\'' +
                ", edited='" + edited + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

}
