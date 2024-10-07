package com.kaicode.web.user;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController//HTTP request層
@RequestMapping(path = "api/v1/users")
public class WebuserController {
    private final WebuserService userService;

    @Autowired
    public WebuserController(WebuserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<Webuser> getUsers() {
        return userService.getWebusers();
    }

    @PostMapping
    public void registerNewWebuser(@RequestBody Webuser Webuser) {
        userService.addNewWebuser(Webuser);
    }

    @DeleteMapping(path = "{webuserId}")
    public void deleteWebuser(@PathVariable("webuserId") Long webuserId){
        userService.deleteWebuser(webuserId);
    }
}