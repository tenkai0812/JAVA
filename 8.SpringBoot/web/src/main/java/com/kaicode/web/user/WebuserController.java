package com.kaicode.web.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Tag(name = "T. 測試", description = "")
@RestController//HTTP request層 @RestController = @Controller + @ResponseBody
@RequestMapping(path = "/test")
@Slf4j
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