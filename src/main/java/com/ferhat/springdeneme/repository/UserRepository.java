package com.ferhat.springdeneme.repository;

import com.ferhat.springdeneme.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findFirstByUserId(Long userId);
}
