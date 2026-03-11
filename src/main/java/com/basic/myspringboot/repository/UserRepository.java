package com.basic.myspringboot.repository;

import com.basic.myspringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// <레포지토리가 관리할 엔티티 클래스, 엔티티의 기본키 타입>
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByNameContains(String name);
    Optional<User> findByEmail(String email);
}
