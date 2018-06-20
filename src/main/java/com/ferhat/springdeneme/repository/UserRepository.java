package com.ferhat.springdeneme.repository;

import com.ferhat.springdeneme.entity.User;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findFirstByUserId(Long userId);

    List<User> findOneByUserFirstNameIgnoreCase(String userFirstName);
}
