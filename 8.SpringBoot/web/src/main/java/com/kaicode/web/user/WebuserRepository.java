package com.kaicode.web.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface WebuserRepository 
        extends JpaRepository<Webuser, Long> {
        
        @Query("SELECT u FROM Webuser u WHERE u.email = ?1")
        Optional <Webuser> findWebuserByEmail(String email);
}
