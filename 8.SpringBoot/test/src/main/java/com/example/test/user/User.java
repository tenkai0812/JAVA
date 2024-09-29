package com.example.test.user;

import javax.persistence.*;
import java.util.Date;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor
@ToString(exclude = "password")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "Created_at")
    private Date createdAt;
    
    @Column(name = "last_login")
    private Date lastLogin;

    private LocalDate dob;

    // 添加自定義構造函數
    public User(Long id, String username, String email, Date createdAt, Date lastLogin, LocalDate dob) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
        this.dob = dob;
    }
}