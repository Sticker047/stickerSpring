package com.sticker.stickerSpring.repository;

import com.sticker.stickerSpring.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDoEntity, Long> {
}
