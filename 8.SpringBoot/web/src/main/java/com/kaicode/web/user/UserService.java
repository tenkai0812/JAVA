package com.kaicode.web.user;

import org.springframework.stereotype.Service;

import java.util.*;
import java.time.LocalDate;

@Service
public class UserService {
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