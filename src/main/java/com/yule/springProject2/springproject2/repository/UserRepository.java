package com.yule.springProject2.springproject2.repository;

import com.yule.springProject2.springproject2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yule.Paulusha on 4/13/2019.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
