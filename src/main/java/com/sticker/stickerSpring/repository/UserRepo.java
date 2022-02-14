package com.sticker.stickerSpring.repository;

import com.sticker.stickerSpring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername (String username);
}
