package com.kaicode.web.user;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping(path = "api/v1/users")
public class WebuserController {
    private final WebuserService userService;

    @Autowired
    public WebuserController(WebuserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<Webuser> getUsers() {
        return userService.getUsers();
    }
}