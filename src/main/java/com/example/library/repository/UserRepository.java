package com.example.library.repository;

import com.example.library.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u where   u.nick = nick")
    User getUserByLogin(@Param("login") String nick);
}
