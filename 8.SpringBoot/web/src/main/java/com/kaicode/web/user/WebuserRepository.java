package com.kaicode.web.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebuserRepository 
        extends JpaRepository<Webuser, Long> {

}
