package com.attendance_manager.repository;

import org.springframework.context.annotation.Primary;
import com.attendance_manager.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marta Ginosyan
 * Date: 11/14/17
 */
@Primary
@Repository
public interface UserRepository extends BaseRepository<User> {

    User findByUsername(String username);

    List<User> findByDtypeNotOrderByCreatedAtDesc(String dtype);

}