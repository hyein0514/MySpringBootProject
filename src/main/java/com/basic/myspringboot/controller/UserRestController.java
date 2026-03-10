package com.basic.myspringboot.controller;

import com.basic.myspringboot.Repository.UserRepository;
import com.basic.myspringboot.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {
    private final UserRepository userRepository;

    //Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//        log.info("UserRepository 구현 클래스 이름 = {}",userRepository.getClass().getName());
//    }

    //User등록
    @PostMapping
    public User create(@RequestBody User userDetail){
        return userRepository.save(userDetail);
    }

    //User 목록조회
    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
