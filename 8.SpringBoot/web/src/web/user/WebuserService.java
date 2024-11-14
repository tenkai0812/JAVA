package com.kaicode.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service//封裝業務邏輯
public class WebuserService {

    private final WebuserRepository webuserRepository;

    @Autowired
    public WebuserService(WebuserRepository webuserRepository) {
        this.webuserRepository = webuserRepository;
    }

    public List<Webuser> getWebusers() {  // 更改方法名為更具描述性的名稱
        return webuserRepository.findAll();
    }

    public void addNewWebuser(Webuser webuser){
        Optional<Webuser> webuserByEmail = webuserRepository.findWebuserByEmail(webuser.getEmail());
        if(webuserByEmail.isPresent()) {
            throw new IllegalStateException("email already exists");
        }
        webuserRepository.save(webuser);
    }

    public void deleteWebuser(Long webuserId){
        boolean exists = webuserRepository.existsById(webuserId);
        if(!exists){
            throw new IllegalStateException(" webuser " +  webuserId + "not found");
        }
        webuserRepository.deleteById(webuserId);
    }
}