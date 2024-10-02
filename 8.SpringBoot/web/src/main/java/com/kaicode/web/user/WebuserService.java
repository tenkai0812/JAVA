package com.kaicode.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.time.LocalDate;

@Service
public class WebuserService {

    private final WebuserRepository webuserRepository;

    @Autowired
    public WebuserService(WebuserRepository webuserRepository) {
        this.webuserRepository = webuserRepository;
    }

    public List<Webuser> getUsers() {  // 更改方法名為更具描述性的名稱
        return webuserRepository.findAll();
    }
}