package com.sticker.stickerSpring.model;

import com.sticker.stickerSpring.entity.ToDoEntity;

public class ToDo {
    private Long id;
    private String title;
    private boolean completed;

    public ToDo() {
    }

    public static ToDo toModel(ToDoEntity entity){
        ToDo model = new ToDo();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());
        model.setCompleted(entity.getCompleted());
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
