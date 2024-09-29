package com.example.test.user;

import java.util.*;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
    @GetMapping
    public List<User> getUsers() {  // 更改方法名為更具描述性的名稱
        return List.of(
            new User(
                1L,
                "TestUser",
                "Test@example.com",
                new Date(),
                new Date(),
                LocalDate.of(2000, 1, 1)
            )
        );
    } 
}
