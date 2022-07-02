package com.example.todoBackend.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name="todo_item")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "is_completed", nullable = false)
    private boolean isCompleted;

    @Column(name = "is_priority", nullable = false)
    private boolean isPriority;

    @Column(name = "is_edited", nullable = false)
    private boolean isEdited;

    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;

    @Column(name = "created_at", nullable = false)
    private ZonedDateTime modifiedAt;

    public TodoItem() {
        super();
    }

    public TodoItem(String title, boolean isCompleted, boolean isPriority, boolean isEdited, String createdAt, String modifiedAt) {
        this.title = title;
        this.isCompleted = isCompleted;
        this.isPriority = isPriority;
        this.isEdited = isEdited;
        this.createdAt = ZonedDateTime.parse(createdAt);
        this.modifiedAt = ZonedDateTime.parse(modifiedAt);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public boolean getIsPriority() {
        return isPriority;
    }

    public void setIsPriority(boolean isPriority) {
        this.isPriority = isPriority;
    }

    public boolean getIsEdited() {
        return isEdited;
    }

    public void setIsEdited(boolean isEdited) {
        this.isEdited = isEdited;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getModifiedAt() {
        return createdAt;
    }

    public void setModifiedAt(ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

}
