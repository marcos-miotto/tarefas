package com.example.tarefas;

import java.time.LocalDateTime;

public class Task {
    private String id;

    private String description;
    private boolean completed;
    private LocalDateTime dueDate;


    public Task(String id, String description, boolean completed, LocalDateTime dueDate) {
        this.id = id;
        this.description = description;
        this.completed = completed;
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String string) {
        this.id = string;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
