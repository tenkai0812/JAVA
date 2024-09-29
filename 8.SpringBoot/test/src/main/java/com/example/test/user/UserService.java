package com.example.test.user;

import java.util.List;
import java.util.*;
import java.time.LocalDate;
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
