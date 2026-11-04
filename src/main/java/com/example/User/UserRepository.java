package com.example.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    void save(User user);
    User findByEmail(String email);
    boolean existsByEmail(String email);
}
