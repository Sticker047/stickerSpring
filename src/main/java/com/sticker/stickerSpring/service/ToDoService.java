package com.sticker.stickerSpring.service;

import com.sticker.stickerSpring.entity.ToDoEntity;
import com.sticker.stickerSpring.entity.UserEntity;
import com.sticker.stickerSpring.model.ToDo;
import com.sticker.stickerSpring.repository.ToDoRepo;
import com.sticker.stickerSpring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo toDoRepo;
    @Autowired
    private UserRepo userRepo;

    public ToDo createToDo (ToDoEntity todo, Long userId){
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return ToDo.toModel(toDoRepo.save(todo));
    }

    public ToDo completeToDo (Long id){
        ToDoEntity todo = toDoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return ToDo.toModel(toDoRepo.save(todo));
    }
}
